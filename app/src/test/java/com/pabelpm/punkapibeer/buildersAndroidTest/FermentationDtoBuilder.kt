package com.pabelpm.punkapibeer.buildersAndroidTest

import com.pabelpm.punkapibeer.data.dto.FermentationDto
import com.pabelpm.punkapibeer.data.dto.TempDto

class FermentationDtoBuilder {

    private var temp = TempDtoBuilder().build()

    fun withTemp(tempDto: TempDto): FermentationDtoBuilder {
        this.temp = tempDto
        return this
    }

    fun build(): FermentationDto {
        return FermentationDto(
            temp
        )
    }
}