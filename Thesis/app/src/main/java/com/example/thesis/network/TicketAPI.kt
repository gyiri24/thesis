package com.example.thesis.network

import com.example.thesis.data.model.RatingResult
import com.example.thesis.data.model.LoginRequest
import com.example.thesis.data.model.LoginResponse
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Body

//http://127.0.0.1:8000/api/ratings
//HOST: http://127.0.0.1:8000/api
//PATH: /ratings


interface TicketAPI {
    @GET("/api/ratings")
    suspend fun getRating() : Call<RatingResult>

    @POST("/api/login")
    suspend fun login(@Body loginRequest: LoginRequest): Response<LoginResponse>

}