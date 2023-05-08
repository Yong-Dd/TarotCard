package com.yongdd.tarotcard.utils.sealds

sealed class UiState {
    object Loading : UiState()
    object LoadingOff : UiState()
    object Finish : UiState()
    data class ChangeUi(val ui: String) : UiState()
    data class ChangeData(val dataName : String, val data : Any?) : UiState()
}