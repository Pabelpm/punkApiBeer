package com.pabelpm.punkapibeer.buildersAndroidTest

import com.pabelpm.punkapibeer.data.dto.MashTempDto
import com.pabelpm.punkapibeer.data.dto.TempDto

class MashTempDtoBuilderAT {

    private var temp = TempDtoBuilderAT().build()
    private var duration = 1

    fun withTemp(tempDto: TempDto): MashTempDtoBuilderAT {
        this.temp = tempDto
        return this
    }

    fun withDuration(durationDto: Int): MashTempDtoBuilderAT {
        this.duration = durationDto
        return this
    }

    fun build(): MashTempDto {
        return MashTempDto(
            temp, duration
        )
    }
}