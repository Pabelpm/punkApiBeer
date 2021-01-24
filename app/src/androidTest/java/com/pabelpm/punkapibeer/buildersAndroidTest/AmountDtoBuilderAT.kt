package com.pabelpm.punkapibeer.buildersAndroidTest

import com.pabelpm.punkapibeer.data.dto.AmountDto

class AmountDtoBuilderAT {

    private var value = 0.0
    private var unit = ""

    fun withValue(valueDto: Double): AmountDtoBuilderAT {
        this.value = valueDto
        return this
    }

    fun withUnit(unitDto: String): AmountDtoBuilderAT {
        this.unit = unitDto
        return this
    }

    fun build(): AmountDto {
        return AmountDto(
            value, unit
        )
    }
}