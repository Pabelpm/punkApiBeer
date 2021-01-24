package com.pabelpm.punkapibeer.buildersAndroidTest

import com.pabelpm.punkapibeer.data.dto.AmountDto

class AmountDtoBuilder {

    private var value = 0.0
    private var unit = ""

    fun withValue(valueDto: Double): AmountDtoBuilder {
        this.value = valueDto
        return this
    }

    fun withUnit(unitDto: String): AmountDtoBuilder {
        this.unit = unitDto
        return this
    }

    fun build(): AmountDto {
        return AmountDto(
            value, unit
        )
    }
}