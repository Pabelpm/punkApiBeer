package com.pabelpm.punkapibeer.buildersAndroidTest

import com.pabelpm.punkapibeer.data.dto.*

class MethodDtoBuilderAT {

    private var mashTempList = arrayListOf<MashTempDto>()
    private var fermentation = FermentationDtoBuilderAT().build()
    private var twist = Any()

    fun withMashTempList(mashTempList: ArrayList<MashTempDto>): MethodDtoBuilderAT {
        this.mashTempList = mashTempList
        return this
    }

    fun withFermentation(fermentationDto: FermentationDto): MethodDtoBuilderAT {
        this.fermentation = fermentation
        return this
    }

    fun withTwist(twist: Any): MethodDtoBuilderAT {
        this.twist = twist
        return this
    }

    fun build(): MethodDto {
        return MethodDto(
            mashTempList, fermentation,twist
        )
    }
}