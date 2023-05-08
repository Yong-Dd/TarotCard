package com.yongdd.tarotcard.utils.objects

import android.content.Context
import android.util.TypedValue
import android.view.View
import java.lang.Exception
import kotlin.math.roundToInt

object DisplayUtils {
    fun pxToDp(context: Context, px: Int): Int {
        val dp = (px * (160.0 / context.resources.displayMetrics.densityDpi)).toFloat()
        return dp.toInt()
    }

    fun dpToPx(context: Context,dp:Int):Int{
        val density = context.resources.displayMetrics.density
        return (dp.toFloat() * density).roundToInt()
    }

    fun dpToPx(context: Context,dp:Float):Int{
        val density = context.resources.displayMetrics.density
        return (dp * density).roundToInt()
    }


    fun getPx(context: Context?, dp: Int): Int {
        try {
            return TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP,
                dp.toFloat(),
                context?.resources?.displayMetrics
            )
                .toInt()
        } catch (e: Exception) {
        }
        return dp
    }
}