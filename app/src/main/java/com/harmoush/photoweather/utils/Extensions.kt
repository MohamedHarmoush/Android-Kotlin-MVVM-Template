package com.harmoush.photoweather.utils

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

/*
Created by Harmoush on 2020-11-13 
*/

fun <T> T.asLiveData(): LiveData<T> {
    return MutableLiveData(this)
}