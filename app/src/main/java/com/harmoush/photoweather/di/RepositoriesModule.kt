package com.harmoush.photoweather.di

import com.harmoush.photoweather.data.source.repository.SampleRepository
import com.harmoush.photoweather.data.source.repository.SampleRepositoryImpl
import org.koin.dsl.module

/*
Created by Harmoush on 2020-11-06 
*/

val repositoriesModule = module {
    factory<SampleRepository> { SampleRepositoryImpl(get(), get()) }
}