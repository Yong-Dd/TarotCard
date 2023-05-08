package com.yongdd.tarotcard.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.yongdd.tarotcard.model.data.Profile
import com.yongdd.tarotcard.model.data.Tarot
import com.yongdd.tarotcard.model.repository.BaseRepository
import com.yongdd.tarotcard.utils.Constants
import com.yongdd.tarotcard.utils.adapter.MainPagerAdapter
import com.yongdd.tarotcard.utils.enums.CardType
import com.yongdd.tarotcard.utils.event.Event
import com.yongdd.tarotcard.utils.sealds.UiAlert
import com.yongdd.tarotcard.utils.sealds.UiState

class MainViewModel(private val repository: BaseRepository) : ViewModel() {

    private val _alertEvent = MutableLiveData<Event<UiAlert>>()
    val alertEvent : LiveData<Event<UiAlert>> get() = _alertEvent

    private val _uiEvent = MutableLiveData<Event<UiState>>()
    val uiEvent: LiveData<Event<UiState>> get() = _uiEvent

    private val _profile = MutableLiveData<Profile>()
    val profile : LiveData<Profile> = _profile

    private val _currentCardType = MutableLiveData<CardType>()
    val currentCardType : LiveData<CardType> = _currentCardType

    val adapter by lazy {
        MainPagerAdapter()
//        { _,type->
//            _currentCardType.value = type
//        }
    }

    var processing = false

    init {
        _currentCardType.value  = CardType.MAJOR
        setProfile()
    }

    fun setCardList(list:MutableList<Tarot>) {
        adapter.lists = list
        adapter.notifyItemRangeInserted(0,list.size)
    }

    private fun setProfile() {
        Log.d("name","${repository.getName()}")
        val name = repository.getName()
        val image = repository.getImage()
        val changeName = if(name.isNullOrBlank()) null else name
        val changeImage = if(image.isNullOrBlank()) null else image

        _profile.value = Profile(changeName,changeImage)
    }

    fun nickNameAddClick() {
        _alertEvent.value = Event(UiAlert.ShowAlertGetText("등록할 이름을 작성해주세요 :D","닉네임은 15글자까지 가능합니다!","취소","작성 완료 😊",{}){ nickName->
            setNickName(nickName)
        })
    }

    private fun setNickName(nickName:String) {
        if(processing) return
        repository.setPrefString(Constants.NICK_NAME,nickName)
        _profile.value = Profile(nickName,profile.value?.imagePath)
    }

    fun profileImgClick() {
        _alertEvent.value = Event(UiAlert.ShowAlertChoice("⚠ 변경","사진을 변경하시겠습니까?","아니오","예",{}){
            _uiEvent.value = Event(UiState.ChangeUi("profileImg"))
        })
    }

    fun changeType(pos:Int){
        _currentCardType.value = adapter.lists[pos].type
    }

    fun tabClick(tab:Int) {
        _uiEvent.value = Event(UiState.ChangeData("tabClick",tab))
    }


}