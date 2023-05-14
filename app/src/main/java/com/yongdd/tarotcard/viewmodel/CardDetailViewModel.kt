package com.yongdd.tarotcard.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.yongdd.tarotcard.model.data.Tarot
import com.yongdd.tarotcard.model.repository.BaseRepository
import com.yongdd.tarotcard.utils.event.Event
import com.yongdd.tarotcard.utils.sealds.UiAlert
import com.yongdd.tarotcard.utils.sealds.UiState

class CardDetailViewModel(private val repository: BaseRepository) : ViewModel() {

    private val _alertEvent = MutableLiveData<Event<UiAlert>>()
    val alertEvent : LiveData<Event<UiAlert>> get() = _alertEvent

    private val _uiEvent = MutableLiveData<Event<UiState>>()
    val uiEvent: LiveData<Event<UiState>> get() = _uiEvent

    private val _detail = MutableLiveData<String>()
    val detail  : LiveData<String> = _detail

    private val _origin = MutableLiveData<String>()
    val origin  : LiveData<String> = _origin

    private val _originVisible = MutableLiveData<Boolean>()
    val originVisible  : LiveData<Boolean> = _originVisible


    fun setImgUrl(detail:String?, origin:String?) {
        _detail.value = detail
        _origin.value = origin
    }

    fun changeOriginVisible(visible : Boolean) {
        _originVisible.value = visible
    }

}