package com.example.sunnyweather.logic.model

import com.google.gson.annotations.SerializedName
import java.util.*

/**
 * @author qiandong
 * @Title: PlaceResponse.kt
 * @Description:
 * @date 2020/7/16
 */
data class PlaceResponse(val status: String, val places: List<Place>)

data class Place(
    val name: String,
    val location: Location, @SerializedName("formatted_address") val address: String
)

data class Location(val lng: String, val lat: String)