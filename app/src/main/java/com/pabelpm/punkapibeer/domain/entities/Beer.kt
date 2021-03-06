package com.pabelpm.punkapibeer.domain.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.pabelpm.punkapibeer.data.dto.BoilVolumeDto
import com.pabelpm.punkapibeer.data.dto.VolumeDto

@Entity
class Beer(
    val id: Int,
    val name: String,
    val description: String,
    val imageUrl: String,
    val volume: ValueUnit,
    val boilVolume: ValueUnit
)