package com.harmoush.photoweather.utils

import androidx.fragment.app.Fragment

/*
Created by Harmoush on 2020-11-06 
*/

fun Fragment.showMessage(message: String?) {
    message.takeUnless { message.isNullOrBlank() }?.let { msg ->
        view.snakeBar(msg)
    }
}

fun Fragment.showMessage(resId: Int) {
    view.snakeBar(getString(resId))
}

fun Fragment.toast(message: String?) {
    message.takeUnless { message.isNullOrBlank() }?.let { msg ->
        view.toast(msg)
    }
}

fun Fragment.toast(resId: Int) {
    view.toast(getString(resId))
}