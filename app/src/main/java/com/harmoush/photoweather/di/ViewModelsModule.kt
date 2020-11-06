package com.harmoush.photoweather.di

import com.harmoush.photoweather.ui.firstfragment.FirstFragmentViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

/*
Created by Harmoush on 2020-11-06 
*/

val viewModelsModule = module {
    viewModel { FirstFragmentViewModel(get()) }
}