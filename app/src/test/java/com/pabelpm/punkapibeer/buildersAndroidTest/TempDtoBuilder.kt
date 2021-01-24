package com.pabelpm.punkapibeer.buildersAndroidTest

import com.pabelpm.punkapibeer.data.dto.TempDto

class TempDtoBuilder {

    private var value = 0
    private var unit = ""

    fun withValue(valueDto: Int): TempDtoBuilder {
        this.value = valueDto
        return this
    }

    fun withUnit(unitDto: String): TempDtoBuilder {
        this.unit = unitDto
        return this
    }

    fun build(): TempDto {
        return TempDto(
            value, unit
        )
    }
}