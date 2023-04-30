package com.example.thesis.repository

import com.example.thesis.data.model.LoginRequest
import com.example.thesis.network.TicketAPI

class LoginRepository(private val ticketAPI: TicketAPI) {
    suspend fun login(loginRequest: LoginRequest) {

    }
}
