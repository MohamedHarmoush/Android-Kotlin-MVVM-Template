package com.harmoush.photoweather.ui.firstfragment

import android.app.Application
import android.widget.Toast
import androidx.lifecycle.AndroidViewModel

/*
Created by Harmoush on 2020-11-06 
*/

class FirstFragmentViewModel(app: Application) : AndroidViewModel(app) {

    fun showToast() {
        Toast.makeText(getApplication(), "Go Next", Toast.LENGTH_SHORT).show()
    }
}