package com.harmoush.photoweather.di

import androidx.room.Room
import com.harmoush.photoweather.BuildConfig
import com.harmoush.photoweather.data.source.local.WeatherDatabase
import org.koin.dsl.module

/*
Created by Harmoush on 2020-11-06 
*/

val databaseModule = module {
    single {
        Room.databaseBuilder(get(), WeatherDatabase::class.java, BuildConfig.DATABASE_NAME)
            .build()
    }

    single { get<WeatherDatabase>().sampleDao() }
}