package com.example.sunnyweather.logic.model

import com.google.gson.annotations.SerializedName

/**
 * @author qiandong
 * @Title: RealtimeResponse.kt
 * @Description:
 * @date 2020/7/20
 */
data class RealtimeResponse(val status: String, val result: Result) {
    data class Result(val realtime: Realtime)

    data class Realtime(
        val skycon: String,
        val temperature: Float, @SerializedName("air_quality") val airQuality: AirQuality
    )

    data class AirQuality(val aqi: AQI)

    data class AQI(val chn: Float)
}