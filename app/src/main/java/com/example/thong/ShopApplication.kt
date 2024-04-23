package com.example.thong

import android.app.Application
import com.example.thong.data.container.AppContainer
import com.example.thong.data.container.DefaultAppContainer

class ShopApplication : Application() {

    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer(this)
    }

}