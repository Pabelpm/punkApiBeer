package com.pabelpm.punkapibeer.buildersAndroidTest

import com.pabelpm.punkapibeer.data.dto.AmountDto
import com.pabelpm.punkapibeer.data.dto.MaltDto

class MaltDtoBuilderAT {

    private var name = ""
    private var amount = AmountDtoBuilderAT().build()

    fun withName(nameDto: String): MaltDtoBuilderAT {
        this.name = nameDto
        return this
    }

    fun withAmount(amountDto: AmountDto): MaltDtoBuilderAT {
        this.amount = amountDto
        return this
    }

    fun build(): MaltDto {
        return MaltDto(
            name, amount
        )
    }
}