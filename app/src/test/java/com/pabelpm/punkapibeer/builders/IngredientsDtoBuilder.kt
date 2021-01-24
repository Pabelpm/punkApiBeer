package com.pabelpm.punkapibeer.builders

import com.pabelpm.punkapibeer.data.dto.AmountDto
import com.pabelpm.punkapibeer.data.dto.HopDto
import com.pabelpm.punkapibeer.data.dto.IngredientsDto
import com.pabelpm.punkapibeer.data.dto.MaltDto

class IngredientsDtoBuilder {

    private var maltList = arrayListOf<MaltDto>()
    private var hopsList = arrayListOf<HopDto>()
    private var yeast = ""

    fun withMaltList(maltDtoList: ArrayList<MaltDto>): IngredientsDtoBuilder {
        this.maltList = maltDtoList
        return this
    }

    fun withHopsList(hopDtoList: ArrayList<HopDto>): IngredientsDtoBuilder {
        this.hopsList = hopDtoList
        return this
    }

    fun withYeast(yeast: String): IngredientsDtoBuilder {
        this.yeast = yeast
        return this
    }

    fun build(): IngredientsDto {
        return IngredientsDto(
            maltList, hopsList, yeast
        )
    }
}