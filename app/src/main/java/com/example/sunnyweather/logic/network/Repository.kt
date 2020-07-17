package com.example.sunnyweather.logic.network

import androidx.lifecycle.liveData
import com.example.sunnyweather.logic.model.Place
import kotlinx.coroutines.Dispatchers
import java.lang.Exception
import java.lang.RuntimeException

/**
 * @author qiandong
 * @Title: Repository.kt
 * @Description:
 * @date 2020/7/16
 */
object Repository {

    fun searchPlaces(query: String) = liveData(Dispatchers.IO){
        val result = try {
            val placeResponse = SunnyWeatherNetwork.searchPlaces(query)
            if (placeResponse.status == "ok"){
                val places = placeResponse.places
                Result.success(places)
            } else {
                Result.failure(RuntimeException("response status is ${placeResponse.status}"))
            }
        } catch (e: Exception){
            Result.failure<List<Place>>(e)
        }
        emit(result)
    }

}