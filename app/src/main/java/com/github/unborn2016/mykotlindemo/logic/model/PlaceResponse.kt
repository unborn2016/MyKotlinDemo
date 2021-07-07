package com.github.unborn2016.mykotlindemo.logic.model

import com.google.gson.annotations.SerializedName

/**
 * Created by Unborn on 2021/7/7.
 */
class PlaceResponse(val status: String, val places: List<Place>)

class Place(val name: String, val location: Location, @SerializedName("formatted_address") val address: String)

class Location(val lng: String, val lat: String)