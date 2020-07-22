package com.example.sunnyweather.logic.model

/**
 * @author qiandong
 * @Title: Weather.kt
 * @Description:
 * @date 2020/7/20
 */
data class Weather(val realtime: RealtimeResponse.Realtime, val daily: DailyResponse.Daily)