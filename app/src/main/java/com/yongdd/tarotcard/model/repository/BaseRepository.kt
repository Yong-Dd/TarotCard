package com.yongdd.tarotcard.model.repository

import android.app.Application
import com.yongdd.tarotcard.utils.Constants
import com.yongdd.tarotcard.utils.objects.Pref

class BaseRepository(private val application: Application) {

    fun getName(): String? = Pref.getString(application, Constants.NICK_NAME)
    fun getImage() : String? = Pref.getString(application, Constants.PROFILE_IMG)

    // https://stackoverflow.com/questions/9049143/android-share-intent-for-a-bitmap-is-it-possible-not-to-save-it-prior-sharing?rq=1


    fun setPrefString(key:String, value:String){
        Pref.setString(application,key,value)
    }

}