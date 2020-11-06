package com.harmoush.photoweather

import android.app.Application
import com.harmoush.photoweather.di.appComponents
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

/*
Created by Harmoush on 2020-11-06 
*/

class PhotoWeatherApp : Application(){
    override fun onCreate() {
        super.onCreate()

        configureDI()
    }

    private fun configureDI() {
        startKoin {
            androidLogger()
            androidContext(this@PhotoWeatherApp)
            modules(provideComponents())
        }
    }

    private fun provideComponents() = appComponents
}