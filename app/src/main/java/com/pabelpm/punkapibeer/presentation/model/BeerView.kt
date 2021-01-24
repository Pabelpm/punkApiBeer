package com.pabelpm.punkapibeer.presentation.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class BeerView(
    val id: Int,
    val name: String,
    val description: String
)