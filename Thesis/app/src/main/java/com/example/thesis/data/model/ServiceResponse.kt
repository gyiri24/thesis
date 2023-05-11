package com.example.thesis.data.model

import com.google.gson.annotations.SerializedName

class ServiceResponse {
    @SerializedName("name"          ) var name           : String? = null
    @SerializedName("price"         ) var price          : String? = null
    @SerializedName("duration"      ) var duration       : String? = null
    @SerializedName("trainer_name"  ) var trainerName    : String? = null
    @SerializedName("email"         ) var email          : String? = null
}