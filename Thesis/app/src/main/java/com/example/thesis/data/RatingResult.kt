package com.example.thesis.data

import com.google.gson.annotations.SerializedName

class RatingResult {
    @SerializedName("id"         ) var id        : String? = null
    @SerializedName("service_id" ) var serviceId : String? = null
    @SerializedName("rating"     ) var rating    : String? = null
    @SerializedName("comment"    ) var comment   : String? = null
}