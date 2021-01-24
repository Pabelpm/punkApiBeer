package com.pabelpm.punkapibeer.buildersAndroidTest

import com.pabelpm.punkapibeer.data.dto.FermentationDto
import com.pabelpm.punkapibeer.data.dto.TempDto

class FermentationDtoBuilderAT {

    private var temp = TempDtoBuilderAT().build()

    fun withTemp(tempDto: TempDto): FermentationDtoBuilderAT {
        this.temp = tempDto
        return this
    }

    fun build(): FermentationDto {
        return FermentationDto(
            temp
        )
    }
}