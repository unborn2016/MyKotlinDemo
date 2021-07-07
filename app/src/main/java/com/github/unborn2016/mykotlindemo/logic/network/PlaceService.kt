package com.github.unborn2016.mykotlindemo.logic.network

import com.github.unborn2016.mykotlindemo.BaseApplication
import com.github.unborn2016.mykotlindemo.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by Unborn on 2021/7/7.
 */
interface PlaceService {
//    @GET("test.json?token=${BaseApplication.TOKEN}&lang=zh_CH")
//    fun searchPlaces(@Query("query") query: String): Call<PlaceResponse>
    @GET("test.json")
    fun searchPlaces(): Call<PlaceResponse>
}