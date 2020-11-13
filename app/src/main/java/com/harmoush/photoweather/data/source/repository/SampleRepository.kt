package com.harmoush.photoweather.data.source.repository

import com.harmoush.photoweather.data.model.WeatherInfo
import com.harmoush.photoweather.data.source.local.DatabaseResource
import com.harmoush.photoweather.data.source.local.entity.SampleEntity
import com.harmoush.photoweather.data.source.remote.NetworkBoundResource
import kotlinx.coroutines.CoroutineScope

/*
Created by Harmoush on 2020-11-06 
*/

interface SampleRepository {

    fun getSampleEntities(scope: CoroutineScope): NetworkBoundResource<List<SampleEntity>, WeatherInfo>
    fun insertEntity(scope: CoroutineScope, entity: SampleEntity): DatabaseResource<Int>
}