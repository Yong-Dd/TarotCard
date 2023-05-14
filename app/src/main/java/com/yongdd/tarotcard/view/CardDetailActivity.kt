package com.yongdd.tarotcard.view

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.yongdd.tarotcard.databinding.ActivityCardDetailBinding
import com.yongdd.tarotcard.model.repository.BaseRepository
import com.yongdd.tarotcard.utils.event.eventObserve
import com.yongdd.tarotcard.utils.objects.Alert
import com.yongdd.tarotcard.utils.sealds.UiAlert
import com.yongdd.tarotcard.utils.sealds.UiState
import com.yongdd.tarotcard.viewmodel.CardDetailViewModel
import com.yongdd.tarotcard.viewmodel.ViewModelFactory

class CardDetailActivity : AppCompatActivity() {
    private lateinit var binding :ActivityCardDetailBinding
    private lateinit var vm : CardDetailViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCardDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setViewModel()
        setObserver()
    }

    private fun setViewModel() {
        val repository = BaseRepository(application)
        val factory = ViewModelFactory(repository)
        vm = factory.let{ ViewModelProvider(this,it)[CardDetailViewModel::class.java]}

        Glide.with(this).load(intent.extras?.getString("cardDetailUrl")).into(binding.detailPhotoView)
        Glide.with(this).load(intent.extras?.getString("cardOriginUrl")).into(binding.originCardImg)
//        vm.setImgUrl(intent.extras?.getString("cardDetailUrl"),intent.extras?.getString("cardOriginUrl"))

        binding.vm = vm
        binding.lifecycleOwner = this
    }

    private fun setObserver() {
        vm.uiEvent.eventObserve(this) {
            when (it) {
                is UiState.ChangeUi -> {
                }
                is UiState.ChangeData -> {
                }
                else -> {}
            }
        }

        vm.alertEvent.eventObserve(this) {
            when (it) {
                is UiAlert.ShowToast -> {
                    Toast.makeText(this,it.message,Toast.LENGTH_SHORT).show()
                }

                is UiAlert.ShowAlertGetText -> {
                    Alert.showGetTextAlert(this,it.title,it.hintText,it.denyText,it.acceptText,it.deny,it.ok)
                }

                is UiAlert.ShowAlertChoice -> {
                    Alert.showAlertChoice(this,it.title,it.message,it.denyText,it.acceptText,it.deny,it.ok)
                }
                else -> {}
            }
        }
    }

}