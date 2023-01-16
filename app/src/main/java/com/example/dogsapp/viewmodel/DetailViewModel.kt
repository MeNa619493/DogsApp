package com.example.dogsapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.dogsapp.model.DogBreed
import com.example.dogsapp.model.DogDao
import kotlinx.coroutines.launch

class DetailViewModel(private val dogDao: DogDao) : ViewModel() {
    private val _dogLiveData = MutableLiveData<DogBreed>()
    val dogLiveData: MutableLiveData<DogBreed>
        get() = _dogLiveData

    fun fetch(dogUuid: Int) {
        viewModelScope.launch {
            _dogLiveData.postValue(dogDao.getDog(dogUuid))
        }
    }
}