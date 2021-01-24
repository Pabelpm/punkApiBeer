package com.pabelpm.punkapibeer.data.dto

import com.google.gson.annotations.SerializedName

data class AmountDto(
    @SerializedName("value") val value: Double,
    @SerializedName("unit") val unit: String
)
