package com.example.thesis.network

import com.example.thesis.data.RatingResult
import retrofit2.Call
import retrofit2.http.GET

//http://127.0.0.1:8000/api/ratings
//HOST: http://127.0.0.1:8000/api
//PATH: /ratings


interface TicketAPI {
    @GET("/api/ratings")
    fun getRating() : Call<RatingResult>
}