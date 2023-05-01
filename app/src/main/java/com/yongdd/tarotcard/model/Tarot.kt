package com.yongdd.tarotcard.model

import android.graphics.drawable.Drawable

data class Tarot(
    val id : Int,
    val name : String,
    val type : CardType,
    val cardImg : Drawable?,
    val cardDetailImg : String
)
