package com.yongdd.tarotcard.utils.custom

import android.view.View
import androidx.viewpager2.widget.ViewPager2
import com.yongdd.tarotcard.utils.objects.DisplayUtils

class PagerTransformer(var screenWidth: Float) :
    ViewPager2.PageTransformer {
    override fun transformPage(page: View, position: Float) {

        val pageWidth: Float = page.getWidth().toFloat()
        val pageHeight: Float = page.getHeight().toFloat()
        val widthDpToPx = DisplayUtils.dpToPx(page.context,pageWidth)
        val width = screenWidth  - (widthDpToPx*0.44f)
        val scaleFactor = MIN_SCALE + (1 - MIN_SCALE) * (1 - Math.abs(position))

        //왼쪽 화면 밖
        if (position <= -1) {
            page.scaleX = scaleFactor
            page.scaleY = scaleFactor


            //해당 화면으로 왼쪽으로 슬라이딩
        } else if (position <= 0) {
            page.translationX = width * position
            page.scaleX = scaleFactor
            page.scaleY = scaleFactor

            //해당 화면 오른쪽으로 슬라이드
        } else if (position < 0) {
            page.translationX = width * position
            page.scaleX = 1f
            page.scaleY = 1f

            //다음 화면
        } else if (position <= 1) {
            page.translationX = width * position
            page.scaleX = scaleFactor
            page.scaleY = scaleFactor
        }
    }

    companion object {
        private const val MIN_SCALE = 0.9f
    }
}