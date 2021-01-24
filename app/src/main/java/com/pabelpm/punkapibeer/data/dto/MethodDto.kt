package com.pabelpm.punkapibeer.data.dto

import com.google.gson.annotations.SerializedName

data class MethodDto(
    @SerializedName("mash_temp")
    val mashTemp: List<MashTempDto?>,
    @SerializedName("fermentation")
    val fermentation: FermentationDto,
    @SerializedName("twist")
    val twist: Any,
)