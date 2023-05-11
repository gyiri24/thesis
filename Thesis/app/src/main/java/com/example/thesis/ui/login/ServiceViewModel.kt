package com.example.thesis.ui.login

import androidx.lifecycle.*
import com.example.thesis.data.model.ServiceResponse
import com.example.thesis.repository.ServiceRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

class ServiceViewModel @Inject constructor(
    private val serviceRepository: ServiceRepository
) : ViewModel() {

    private val _services = MutableLiveData<List<ServiceResponse>>()
    val services: LiveData<List<ServiceResponse>> = _services

    private val _loading = MutableLiveData<Boolean>()
    val loading: LiveData<Boolean> = _loading

    init {
        loadServices()
    }

    private fun loadServices() {
        viewModelScope.launch {
            _loading.value = true
            _services.value = withContext(Dispatchers.IO) { serviceRepository.getServices() }!!
            _loading.value = false
        }
    }
}