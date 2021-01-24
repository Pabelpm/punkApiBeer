package com.pabelpm.punkapibeer.domain.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.pabelpm.punkapibeer.data.dto.BoilVolumeDto
import com.pabelpm.punkapibeer.data.dto.VolumeDto

@Entity
class ValueUnit(
    //Can be use pairs, but now we can added new attributes
    val value: Double,
    val unit: String
)