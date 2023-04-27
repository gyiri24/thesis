package com.example.thesis.data.model

import com.google.gson.annotations.SerializedName

class LoginResponse {
    @SerializedName("api_token") var apiToken: String? = null
}