package com.example.thesis.network

import com.example.thesis.data.model.*
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Body
import retrofit2.http.Query

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
    suspend fun storeTransaction(@Query("slug") name: String? = null): Response<TransactionResponse>

    object ApiService {
        private val okHttpClient = OkHttpClient.Builder()
            .addInterceptor { chain ->
                val originalRequest = chain.request()

                val requestBuilder = originalRequest.newBuilder()
                    .header("Authorization", "Bearer " + "api_token")
                    .method(originalRequest.method(), originalRequest.body())

                val request = requestBuilder.build()
                chain.proceed(request)
            }
            .build()

        private val retrofit = Retrofit.Builder()
            .baseUrl("http://127.0.0.1:8080/api/v1/")
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

}