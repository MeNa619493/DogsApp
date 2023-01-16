package com.example.dogsapp

import android.app.Application
import com.example.dogsapp.model.DogDatabase
import com.example.dogsapp.model.DogsApiService
import com.example.dogsapp.util.SharedPreferencesHelper

class MyApplication: Application() {
    val apiService by lazy { DogsApiService() }
    val dogDao by lazy { DogDatabase.invoke(this).dogDao() }
    val prefHelper by lazy { SharedPreferencesHelper(this) }
}