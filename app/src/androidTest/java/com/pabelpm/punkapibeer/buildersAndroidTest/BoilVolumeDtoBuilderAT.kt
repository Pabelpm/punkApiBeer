package com.pabelpm.punkapibeer.buildersAndroidTest

import com.pabelpm.punkapibeer.data.dto.BoilVolumeDto

class BoilVolumeDtoBuilderAT {

    private var value = 0
    private var unit = ""

    fun withValue(valueDto: Int): BoilVolumeDtoBuilderAT {
        this.value = valueDto
        return this
    }

    fun withUnit(unitDto: String): BoilVolumeDtoBuilderAT {
        this.unit = unitDto
        return this
    }

    fun build(): BoilVolumeDto {
        return BoilVolumeDto(
            value, unit
        )
    }
}