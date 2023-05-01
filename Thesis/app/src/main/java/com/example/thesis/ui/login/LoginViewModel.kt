package com.example.thesis.ui.login

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.thesis.data.model.LoginRequest
import com.example.thesis.repository.LoginRepository
import kotlinx.coroutines.launch

class LoginViewModel(private val loginRepository: LoginRepository): ViewModel() {
    val loginResult = MutableLiveData<String>()
    val loading = MutableLiveData<Boolean>()

    init {
        loading.value = false
    }

    fun login(email: String, password: String) {
        viewModelScope.launch {
            loading.value = true

            try {
                val apiToken = loginRepository.login(LoginRequest(email, password))
                loginResult.value = "success: $apiToken"
            } catch (e: Exception) {
                loginResult.value = "failed: ${e.message}"
            }

            loading.value = false
        }
    }
}