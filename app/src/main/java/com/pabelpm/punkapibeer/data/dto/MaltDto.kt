package com.pabelpm.punkapibeer.data.dto

import com.google.gson.annotations.SerializedName

data class MaltDto(
    @SerializedName("name")
    val name: String,
    @SerializedName("amount")
    val amount: AmountDto,
)