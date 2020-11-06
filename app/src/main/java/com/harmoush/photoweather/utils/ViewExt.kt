package com.harmoush.photoweather.utils

import android.view.View
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

/*
Created by Harmoush on 2020-11-06 
*/

data class SnackbarOptions(
    val duration: Int = Snackbar.LENGTH_LONG,
    val actionText: String? = null,
    val actionListener: View.OnClickListener? = null
)

fun View?.snakeBar(message: String, options: SnackbarOptions = SnackbarOptions()) {
    this?.let {
        Snackbar.make(it, message, options.duration)
            .setAction(options.actionText, options.actionListener)
            .show()
    }
}

fun View?.toast(message: String) {
    this?.let {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }
}
