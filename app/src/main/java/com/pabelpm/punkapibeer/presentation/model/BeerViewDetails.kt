package com.pabelpm.punkapibeer.presentation.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.pabelpm.punkapibeer.domain.entities.ValueUnit
import com.pabelpm.punkapibeer.presentation.views.ValueComponent

@Entity
data class BeerViewDetails(
    val name: String,
    val description: String,
    val imageUrl: String,
    val volume: ValueUnit,
    val boilVolume : ValueUnit,
)