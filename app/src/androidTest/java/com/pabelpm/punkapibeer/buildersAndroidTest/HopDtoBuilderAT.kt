package com.pabelpm.punkapibeer.buildersAndroidTest

import com.pabelpm.punkapibeer.data.dto.AmountDto
import com.pabelpm.punkapibeer.data.dto.HopDto

class HopDtoBuilderAT {

    private var name = ""
    private var amount = AmountDtoBuilderAT().build()
    private var add = ""
    private var attribute = ""

    fun withName(nameDto: String): HopDtoBuilderAT {
        this.name = nameDto
        return this
    }

    fun withAmount(amountDto: AmountDto): HopDtoBuilderAT {
        this.amount = amountDto
        return this
    }

    fun withAdd(addDto: String): HopDtoBuilderAT {
        this.add = addDto
        return this
    }

    fun withAttribute(attributeDto: String): HopDtoBuilderAT {
        this.attribute = attributeDto
        return this
    }

    fun build(): HopDto {
        return HopDto(
            name, amount,add, attribute
        )
    }
}