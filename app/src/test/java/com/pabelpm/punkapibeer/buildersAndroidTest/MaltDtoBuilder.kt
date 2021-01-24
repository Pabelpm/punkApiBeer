package com.pabelpm.punkapibeer.buildersAndroidTest

import com.pabelpm.punkapibeer.data.dto.AmountDto
import com.pabelpm.punkapibeer.data.dto.MaltDto

class MaltDtoBuilder {

    private var name = ""
    private var amount = AmountDtoBuilder().build()

    fun withName(nameDto: String): MaltDtoBuilder {
        this.name = nameDto
        return this
    }

    fun withAmount(amountDto: AmountDto): MaltDtoBuilder {
        this.amount = amountDto
        return this
    }

    fun build(): MaltDto {
        return MaltDto(
            name, amount
        )
    }
}