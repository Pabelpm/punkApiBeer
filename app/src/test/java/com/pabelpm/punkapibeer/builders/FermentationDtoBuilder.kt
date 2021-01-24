package com.pabelpm.punkapibeer.builders

import com.pabelpm.punkapibeer.data.dto.AmountDto
import com.pabelpm.punkapibeer.data.dto.BoilVolumeDto
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