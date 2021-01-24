package com.pabelpm.punkapibeer.buildersAndroidTest

import com.pabelpm.punkapibeer.data.dto.TempDto

class TempDtoBuilderAT {

    private var value = 0
    private var unit = ""

    fun withValue(valueDto: Int): TempDtoBuilderAT {
        this.value = valueDto
        return this
    }

    fun withUnit(unitDto: String): TempDtoBuilderAT {
        this.unit = unitDto
        return this
    }

    fun build(): TempDto {
        return TempDto(
            value, unit
        )
    }
}