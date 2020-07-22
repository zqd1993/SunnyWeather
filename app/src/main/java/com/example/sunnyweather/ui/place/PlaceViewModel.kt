package com.example.sunnyweather.ui.place

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.example.sunnyweather.logic.model.Place
import com.example.sunnyweather.logic.network.Repository

/**
 * @author qiandong
 * @Title: PlaceViewModel.kt
 * @Description:
 * @date 2020/7/16
 */
class PlaceViewModel : ViewModel() {

    private val searchLiveData = MutableLiveData<String>()

    val placeList = ArrayList<Place>()

    val placeLiveData =
        Transformations.switchMap(searchLiveData) { query -> Repository.searchPlaces(query) }

    fun searchPlaces(query: String){
        searchLiveData.value = query
    }

    fun savePlace(place: Place) = Repository.savePlace(place)

    fun getSavePlace() = Repository.getSavePlace()

    fun isPlaceSaved() = Repository.isPlaceSaved()

}