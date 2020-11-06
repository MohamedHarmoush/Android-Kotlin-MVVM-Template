package com.harmoush.photoweather.data.source.repository

import androidx.lifecycle.LiveData
import com.harmoush.photoweather.data.model.WeatherInfo
import com.harmoush.photoweather.data.source.local.dao.SampleDao
import com.harmoush.photoweather.data.source.local.entity.SampleEntity
import com.harmoush.photoweather.data.source.remote.ApiResponse
import com.harmoush.photoweather.data.source.remote.ApiService
import com.harmoush.photoweather.data.source.remote.NetworkBoundResource
import kotlinx.coroutines.CoroutineScope

/*
Created by Harmoush on 2020-11-06 
*/

class SampleRepositoryImpl(private val sampleDao: SampleDao, private val apiService: ApiService) :
    SampleRepository {

    override fun getSampleEntities(scope: CoroutineScope): NetworkBoundResource<List<SampleEntity>, WeatherInfo> {
        return object : NetworkBoundResource<List<SampleEntity>, WeatherInfo>(scope) {
            override fun saveCallResult(item: WeatherInfo) {
                TODO("Not yet implemented")
            }

            override fun shouldFetch(data: List<SampleEntity>?): Boolean {
                TODO("Not yet implemented")
            }

            override fun loadFromDb(): LiveData<List<SampleEntity>> {
                TODO("Not yet implemented")
            }

            override fun createCall(): LiveData<ApiResponse<WeatherInfo>> {
                TODO("Not yet implemented")
            }
        }
    }
}