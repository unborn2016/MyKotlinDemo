package com.github.unborn2016.mykotlindemo.logic.network

import com.github.unborn2016.mykotlindemo.logic.model.DailyResponse
import com.github.unborn2016.mykotlindemo.logic.model.RealtimeResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface WeatherService {

//    @GET("v2.5/${SunnyWeatherApplication.TOKEN}/{lng},{lat}/realtime.json")
//    fun getRealtimeWeather(@Path("lng") lng: String, @Path("lat") lat: String): Call<RealtimeResponse>
//
//    @GET("v2.5/${SunnyWeatherApplication.TOKEN}/{lng},{lat}/daily.json")
//    fun getDailyWeather(@Path("lng") lng: String, @Path("lat") lat: String): Call<DailyResponse>
    @GET("realtimeWeather.json")
    fun getRealtimeWeather(): Call<RealtimeResponse>

    @GET("dailyWeather.json")
    fun getDailyWeather(): Call<DailyResponse>

}