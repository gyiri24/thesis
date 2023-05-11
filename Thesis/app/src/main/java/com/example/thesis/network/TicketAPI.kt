package com.example.thesis.network

import com.example.thesis.data.model.*
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
    suspend fun getRating() : Call<RatingResponse>

    @POST("/api/login")
    suspend fun login(@Body loginRequest: LoginRequest): Response<LoginResponse>

    @GET("/v1/users")
    suspend fun getUsers(): Response<List<UserResponse>>

    @GET("/v1/services")
    suspend fun getServices(): Response<List<ServiceResponse>>

    @GET("/v1/me")
    suspend fun getMe(): Response<UserResponse>

    @POST("/v1/logout")
    suspend fun logout(): Response<Void>

    @GET("/v1/user/ratings")
    suspend fun getUserRatings(): Response<List<RatingResponse>>

    @GET("/v1/user/transactions")
    suspend fun getUserTransactions(): Response<List<TransactionResponse>>

    @POST("/v1/user/transactions")
    suspend fun storeTransaction(@Body transactionRequest: TransactionRequest): Response<TransactionResponse>

}