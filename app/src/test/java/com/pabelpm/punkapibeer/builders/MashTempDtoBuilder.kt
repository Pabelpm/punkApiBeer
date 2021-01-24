package com.pabelpm.punkapibeer.builders

import com.pabelpm.punkapibeer.data.dto.AmountDto
import com.pabelpm.punkapibeer.data.dto.MaltDto
import com.pabelpm.punkapibeer.data.dto.MashTempDto
import com.pabelpm.punkapibeer.data.dto.TempDto

class MashTempDtoBuilder {

    private var temp = TempDtoBuilder().build()
    private var duration = 1

    fun withTemp(tempDto: TempDto): MashTempDtoBuilder {
        this.temp = tempDto
        return this
    }

    fun withDuration(durationDto: Int): MashTempDtoBuilder {
        this.duration = durationDto
        return this
    }

    fun build(): MashTempDto {
        return MashTempDto(
            temp, duration
        )
    }
}