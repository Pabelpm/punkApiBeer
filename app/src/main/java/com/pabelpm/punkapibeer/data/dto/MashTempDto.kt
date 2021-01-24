package com.pabelpm.punkapibeer.data.dto

import com.google.gson.annotations.SerializedName

data class MashTempDto(
    @SerializedName("temp")
    val temp: TempDto,
    @SerializedName("duration")
    val duration: Int,
)