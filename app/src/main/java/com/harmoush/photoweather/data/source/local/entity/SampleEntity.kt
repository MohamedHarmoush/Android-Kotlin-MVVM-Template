package com.harmoush.photoweather.data.source.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

/*
Created by Harmoush on 2020-11-06 
*/

@Entity
data class SampleEntity(@PrimaryKey(autoGenerate = true) val id: Int, val name: String)