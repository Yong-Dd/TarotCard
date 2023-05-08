package com.yongdd.tarotcard.view

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager2.widget.ViewPager2
import com.yongdd.tarotcard.databinding.ActivityMainBinding
import com.yongdd.tarotcard.model.repository.BaseRepository
import com.yongdd.tarotcard.utils.custom.PagerTransformer
import com.yongdd.tarotcard.utils.event.eventObserve
import com.yongdd.tarotcard.utils.objects.Alert
import com.yongdd.tarotcard.utils.objects.CardList
import com.yongdd.tarotcard.utils.sealds.UiAlert
import com.yongdd.tarotcard.utils.sealds.UiState
import com.yongdd.tarotcard.viewmodel.MainViewModel
import com.yongdd.tarotcard.viewmodel.ViewModelFactory

class MainActivity : AppCompatActivity() {
    private lateinit var binding :ActivityMainBinding
    private lateinit var vm : MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setViewModel()
        setObserver()
        setViewPager()
    }

    private fun setViewModel() {
        val repository = BaseRepository(application)
        val factory = ViewModelFactory(repository)
        vm = factory.let{ ViewModelProvider(this,it)[MainViewModel::class.java]}

        val list = CardList.getCardList(this)
        vm.setCardList(list)

        binding.vm = vm
        binding.lifecycleOwner = this
    }

    private fun setObserver() {
        vm.uiEvent.eventObserve(this) {
            when (it) {
                is UiState.ChangeUi -> {
                    Toast.makeText(this,"개발 중 입니다 :D",Toast.LENGTH_SHORT).show()
                }
                is UiState.ChangeData -> {
                    when(it.dataName) {
                        "tabClick" -> {
                            val changeTabNum = when(it.data as Int) {
                                1->{ 0 }
                                2->{ 22 }
                                3->{ 36 }
                                4->{ 50 }
                                5->{ 64 }
                                else->{ 0 }
                            }
                            binding.mainPager.setCurrentItem(changeTabNum,false)
                        }
                    }
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

    private fun setViewPager() {
        binding.mainPager.adapter = vm.adapter
        binding.mainPager.offscreenPageLimit = 3

        val screenWidth = resources.displayMetrics.widthPixels.toFloat()
        binding.mainPager.setPageTransformer(PagerTransformer(screenWidth))


        binding.mainPager.registerOnPageChangeCallback(object:ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                vm.changeType(position)
            }
        })

    }
}