package com.example.thesis.data.model

import com.google.gson.annotations.SerializedName

class TransactionResponse {
    @SerializedName("price"           ) var price          : String? = null
    @SerializedName("created_at"      ) var createdAt       : String? = null
    @SerializedName("service_id"      ) var serviceId       : Int? = null
    @SerializedName("user_id"         ) var userId          : Int? = null
}