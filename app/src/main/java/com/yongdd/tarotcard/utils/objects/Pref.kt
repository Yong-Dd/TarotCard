package com.yongdd.tarotcard.utils.objects

import android.content.Context
import android.content.Context.MODE_PRIVATE

object Pref {
    private const val preferencesKey: String = "appData"

    fun getString(context: Context, key: String): String? {
        val appData = context.getSharedPreferences(preferencesKey, MODE_PRIVATE)
        return appData.getString(key, "")
    }

    fun setString(context: Context, key: String, str: String) {
        val appData = context.getSharedPreferences(preferencesKey, MODE_PRIVATE)
        val editor = appData.edit()
        editor.putString(key, str)
        editor.apply()
    }
    fun getInt(context: Context, key: String): Int {
        val appData = context.getSharedPreferences(preferencesKey, MODE_PRIVATE)
        return appData.getInt(key, 0)
    }

    fun setInt(context: Context, key: String, i: Int) {
        val appData = context.getSharedPreferences(preferencesKey, MODE_PRIVATE)
        val editor = appData.edit()
        editor.putInt(key, i)
        editor.apply()
    }

    fun setLong(context: Context, key: String, l: Long){
        val appData = context.getSharedPreferences(preferencesKey, MODE_PRIVATE)
        val editor = appData.edit()
        editor.putLong(key, l)
        editor.apply()
    }

    fun getLong(context: Context, key: String) : Long {
        val appData = context.getSharedPreferences(preferencesKey, MODE_PRIVATE)
        return appData.getLong(key, 0)
    }

    fun contains(context: Context,key: String):Boolean{
        val appData = context.getSharedPreferences(preferencesKey, MODE_PRIVATE)
        return appData.contains(key)
    }
}