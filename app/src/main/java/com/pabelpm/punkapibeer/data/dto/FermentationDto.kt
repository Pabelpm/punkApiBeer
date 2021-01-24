package com.pabelpm.punkapibeer.data.dto

import com.google.gson.annotations.SerializedName

data class FermentationDto(
    @SerializedName("temp")
    val temp: TempDto
)