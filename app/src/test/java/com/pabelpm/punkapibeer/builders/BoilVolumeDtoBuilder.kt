package com.pabelpm.punkapibeer.builders

import com.pabelpm.punkapibeer.data.dto.AmountDto
import com.pabelpm.punkapibeer.data.dto.BoilVolumeDto

class BoilVolumeDtoBuilder {

    private var value = 0
    private var unit = ""

    fun withValue(valueDto: Int): BoilVolumeDtoBuilder {
        this.value = valueDto
        return this
    }

    fun withUnit(unitDto: String): BoilVolumeDtoBuilder {
        this.unit = unitDto
        return this
    }

    fun build(): BoilVolumeDto {
        return BoilVolumeDto(
            value, unit
        )
    }
}