package com.yongdd.tarotcard.utils.objects

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

object BindingAdapter {
    @BindingAdapter("imageUrl")
    @JvmStatic
    fun loadUrlImage(imageView: ImageView,url:String?){
        if(url.isNullOrEmpty()) return
        Glide.with(imageView.context)
            .load(url)
            .into(imageView)
    }
}