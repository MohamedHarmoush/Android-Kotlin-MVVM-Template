package com.harmoush.photoweather.utils

import android.graphics.drawable.Drawable
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.google.android.material.snackbar.Snackbar
import java.io.File

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

@BindingAdapter("imageUrl", "placeholder", requireAll = false)
fun ImageView.loadImage(
    imageUrl: String?,
    placeholderDrawable: Drawable? = null
) {
    Glide.with(this)
        .load(imageUrl)
        .placeholder(placeholderDrawable)
        .error(placeholderDrawable)
        .into(this)
}

fun ImageView.loadImage(file: File?) {
    Glide.with(this)
        .load(file)
        .into(this)
}

fun View.hide(visibility: Int = View.GONE) {
    this.visibility = visibility
}

fun View.show() {
    visibility = View.VISIBLE
}