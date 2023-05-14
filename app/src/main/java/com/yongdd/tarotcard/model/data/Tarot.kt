package com.yongdd.tarotcard.model.data

import android.graphics.drawable.Drawable
import com.yongdd.tarotcard.utils.enums.CardType

data class Tarot(
    val id : Int,
    val name : String?,
    val type : CardType,
    val cardImg : Drawable?,
    val cardDetailImgUrl : String,
    val originCardImgUrl : String?
)