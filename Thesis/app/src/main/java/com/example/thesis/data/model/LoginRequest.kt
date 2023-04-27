package com.example.thesis.data.model

import com.google.gson.annotations.SerializedName

data class LoginRequest(
    val email: String,
    val password: String,
)