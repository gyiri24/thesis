package com.example.thesis.repository

import com.example.thesis.data.model.LoginRequest
import com.example.thesis.network.TicketAPI

class LoginRepository(private val ticketAPI: TicketAPI) {
    sealed class LoginResult {
        data class Success(val apiToken: String) : LoginResult()
        data class Failure(val errorMessage: String) : LoginResult()
    }
    suspend fun login(loginRequest: LoginRequest) {
        try {
            val response = ticketAPI.login(loginRequest)

            if (response.isSuccessful) {
                val apiToken = response.body()?.apiToken ?: ""
                LoginResult.Success(apiToken)
            } else {
                LoginResult.Failure("Sikertelen bejelentkezés")
            }
        } catch (e: Exception) {
            LoginResult.Failure(e.message ?: "Ismeretlen hiba")
        }
    }
}
