package com.example.dogsapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.dogsapp.model.DogDao
import com.example.dogsapp.model.DogsApiService
import com.example.dogsapp.util.SharedPreferencesHelper

class DetailViewModelFactory(private val dogDao: DogDao) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(DetailViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return DetailViewModel(dogDao) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}