package com.harmoush.photoweather.utils

import android.content.Context
import android.view.View
import androidx.core.content.ContextCompat

/*
Created by Harmoush on 2020-11-06 
*/

object UiUtils {
    fun showViews(vararg views: View) {
        views.forEach { view -> view.visibility = View.VISIBLE }
    }

    fun hideViews(vararg views: View, visibility: Int = View.GONE) {
        views.forEach { view -> view.visibility = visibility }
    }

    fun getDimen(context: Context, resId: Int): Int {
        return context.resources.getDimension(resId).toInt()
    }

    fun getColor(context: Context, resId: Int): Int {
        return ContextCompat.getColor(context, resId)
    }
}