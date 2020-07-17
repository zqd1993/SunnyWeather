package com.example.sunnyweather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

/**
 * @author qiandong
 * @Title: SunnyWeatherApplication.kt
 * @Description:
 * @date 2020/7/16
 */
class SunnyWeatherApplication : Application(){
    companion object {
        const val Token = "qfBWZnltnZMUWSXV"
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}