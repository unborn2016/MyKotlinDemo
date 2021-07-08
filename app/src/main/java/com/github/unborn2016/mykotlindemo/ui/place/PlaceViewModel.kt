package com.github.unborn2016.mykotlindemo.ui.place

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.github.unborn2016.mykotlindemo.logic.Repository
import com.github.unborn2016.mykotlindemo.logic.model.Place
import com.github.unborn2016.mykotlindemo.logic.model.PlaceResponse

/**
 * Created by Unborn on 2021/7/7.
 */
class PlaceViewModel: ViewModel() {
    private val searchLiveData = MutableLiveData<String>()

    val placeList = ArrayList<Place>()

    val placeLiveData = Transformations.switchMap(searchLiveData) { query ->
        Repository.searchPlaces(query)
    }

    fun searchPlaces(query: String) {
        searchLiveData.value = query
    }

    fun savePlace(place: Place) = Repository.savePlace(place)

    fun getSavedPlace() = Repository.getSavedPlace()

    fun isPlaceSaved() = Repository.isPlaceSaved()
}