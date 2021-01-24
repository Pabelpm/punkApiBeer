package com.pabelpm.punkapibeer.builders

import com.pabelpm.punkapibeer.data.dto.*

class MethodDtoBuilder {

    private var mashTempList = arrayListOf<MashTempDto>()
    private var fermentation = FermentationDtoBuilder().build()
    private var twist = Any()

    fun withMashTempList(mashTempList: ArrayList<MashTempDto>): MethodDtoBuilder {
        this.mashTempList = mashTempList
        return this
    }

    fun withFermentation(fermentationDto: FermentationDto): MethodDtoBuilder {
        this.fermentation = fermentation
        return this
    }

    fun withTwist(twist: Any): MethodDtoBuilder {
        this.twist = twist
        return this
    }

    fun build(): MethodDto {
        return MethodDto(
            mashTempList, fermentation,twist
        )
    }
}