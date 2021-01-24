package com.pabelpm.punkapibeer.presentation.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class BeerViewDetails(
    val name: String,
    val description: String,
    val imageUrl: String
)