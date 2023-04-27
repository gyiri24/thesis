package com.example.thesis.repository

import com.example.thesis.data.model.LoginRequest
import com.example.thesis.network.TicketAPI
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class UserRepository(private val api: TicketAPI) {
    suspend fun login(email: String, password: String): String? {
        return try {
            val loginRequest = LoginRequest(email, password)
            val response = withContext(Dispatchers.IO) { api.login(loginRequest) }

            if (response.isSuccessful) {
                response.body()?.apiToken
            } else {
                null
            }
        } catch (e: Exception) {
            null
        }
    }
}