package com.pabelpm.punkapibeer.buildersAndroidTest

import com.pabelpm.punkapibeer.data.dto.AmountDto
import com.pabelpm.punkapibeer.data.dto.HopDto

class HopDtoBuilder {

    private var name = ""
    private var amount = AmountDtoBuilder().build()
    private var add = ""
    private var attribute = ""

    fun withName(nameDto: String): HopDtoBuilder {
        this.name = nameDto
        return this
    }

    fun withAmount(amountDto: AmountDto): HopDtoBuilder {
        this.amount = amountDto
        return this
    }

    fun withAdd(addDto: String): HopDtoBuilder {
        this.add = addDto
        return this
    }

    fun withAttribute(attributeDto: String): HopDtoBuilder {
        this.attribute = attributeDto
        return this
    }

    fun build(): HopDto {
        return HopDto(
            name, amount,add, attribute
        )
    }
}