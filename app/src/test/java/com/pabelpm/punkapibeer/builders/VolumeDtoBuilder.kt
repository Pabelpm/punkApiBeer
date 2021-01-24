package com.pabelpm.punkapibeer.builders

import com.pabelpm.punkapibeer.data.dto.AmountDto
import com.pabelpm.punkapibeer.data.dto.BoilVolumeDto
import com.pabelpm.punkapibeer.data.dto.TempDto
import com.pabelpm.punkapibeer.data.dto.VolumeDto

class VolumeDtoBuilder {

    private var value = 0
    private var unit = ""

    fun withValue(valueDto: Int): VolumeDtoBuilder {
        this.value = valueDto
        return this
    }

    fun withUnit(unitDto: String): VolumeDtoBuilder {
        this.unit = unitDto
        return this
    }

    fun build(): VolumeDto {
        return VolumeDto(
            value, unit
        )
    }
}