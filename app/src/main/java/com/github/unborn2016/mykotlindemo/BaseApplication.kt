package com.github.unborn2016.mykotlindemo

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

/**
 * Created by Unborn on 2021/7/7.
 */
class BaseApplication : Application() {

    companion object {
        const val TOKEN = "123"

        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}