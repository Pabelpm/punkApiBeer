package com.pabelpm.punkapibeer.domain.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Beer(
    val id: Int,
    val name: String,
    val description: String
)