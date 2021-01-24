package com.pabelpm.punkapibeer.data.dto

import com.google.gson.annotations.SerializedName

data class BeerDto(
    @SerializedName("id")
    val id: Int,

    @SerializedName("name")
    val name: String,

    @SerializedName("tagline")
    val tagline: String,

    @SerializedName("first_brewed")
    val firstBrewed: String,

    @SerializedName("description")
    val description: String,

    @SerializedName("image_url")
    val imageUrl: String,

    @SerializedName("abv")
    val abv: Double,

    @SerializedName("ibu")
    val ibu: Int,

    @SerializedName("target_fg")
    val targetFg: Int,

    @SerializedName("target_og")
    val targetOg: Int,

    @SerializedName("ebc")
    val ebc: Int,

    @SerializedName("srm")
    val srm: Int,

    @SerializedName("ph")
    val ph: Double,

    @SerializedName("attenuation_level")
    val attenuationLevel: Int,

    @SerializedName("volume")
    val volume: VolumeDto,

    @SerializedName("boil_volume")
    val boilVolume: BoilVolumeDto,

    @SerializedName("method")
    val method: MethodDto,

    @SerializedName("ingredients")
    val ingredients: IngredientsDto,

    @SerializedName("food_pairing")
    val foodPairing: List<String>,

    @SerializedName("brewers_tips")
    val brewersTips: String,

    @SerializedName("contributed_by")
    val contributedBy: String,
)