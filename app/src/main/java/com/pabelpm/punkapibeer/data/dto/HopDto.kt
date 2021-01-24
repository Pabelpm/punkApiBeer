package com.pabelpm.punkapibeer.data.dto

import com.google.gson.annotations.SerializedName

data class HopDto(

    @SerializedName("name")
    val name: String,

    @SerializedName("amount")
    val amount: AmountDto,

    @SerializedName("add")
    val add: String,

    @SerializedName("attribute")
    val attribute: String,
)