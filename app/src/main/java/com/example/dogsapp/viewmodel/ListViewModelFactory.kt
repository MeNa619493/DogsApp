package com.example.dogsapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.dogsapp.model.DogDao
import com.example.dogsapp.model.DogsApiService
import com.example.dogsapp.util.SharedPreferencesHelper

class ListViewModelFactory(private val dogsService: DogsApiService,
                           private val dogDao: DogDao,
                           private val prefHelper: SharedPreferencesHelper) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ListViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return ListViewModel(dogsService, dogDao, prefHelper) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}