package com.example.thesis.data.model

import com.google.gson.annotations.SerializedName

class UserResponse {
    @SerializedName("email"           ) var email        : String? = null
    @SerializedName("first_name"      ) var first_name   : String? = null
    @SerializedName("last_name"       ) var last_name    : String? = null
    @SerializedName("amount"          ) var amount       : Int?    = null
    @SerializedName("newsletter"      ) var newsletter   : Boolean? = false
    @SerializedName("fullName"        ) var fullName     : String? = null
}