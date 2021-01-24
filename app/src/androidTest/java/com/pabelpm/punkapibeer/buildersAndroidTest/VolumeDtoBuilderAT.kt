package com.pabelpm.punkapibeer.buildersAndroidTest

import com.pabelpm.punkapibeer.data.dto.VolumeDto

class VolumeDtoBuilderAT {

    private var value = 0
    private var unit = ""

    fun withValue(valueDto: Int): VolumeDtoBuilderAT {
        this.value = valueDto
        return this
    }

    fun withUnit(unitDto: String): VolumeDtoBuilderAT {
        this.unit = unitDto
        return this
    }

    fun build(): VolumeDto {
        return VolumeDto(
            value, unit
        )
    }
}