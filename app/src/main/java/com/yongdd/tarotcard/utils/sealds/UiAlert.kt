package com.yongdd.tarotcard.utils.sealds

sealed class UiAlert {
    data class ShowToast(val message: String) : UiAlert()
    data class ShowSnackBar(val message: String) : UiAlert()
    data class ShowErrorAlert(val title:String, val message: String?) : UiAlert()
    data class ShowErrorFinish(val title:String, val message: String?) : UiAlert()
    data class ShowAlertOk(val title:String, val body:String, val rightText:String?,val right:() -> Unit) : UiAlert()
    data class ShowAlertChoice(val title:String, val message: String, val denyText:String, val acceptText:String, val deny: () -> Unit, val ok: () -> Unit) : UiAlert()
    data class ShowAlertGetText(val title:String, val hintText: String, val denyText:String, val acceptText:String, val deny: () -> Unit, val ok: (String) -> Unit) : UiAlert()
}