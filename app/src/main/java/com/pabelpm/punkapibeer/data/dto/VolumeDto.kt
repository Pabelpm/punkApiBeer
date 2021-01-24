package com.pabelpm.punkapibeer.data.dto

import com.google.gson.annotations.SerializedName

data class VolumeDto(
    @SerializedName("value")
    val value: Int,
    @SerializedName("unit")
    val unit: String,
)