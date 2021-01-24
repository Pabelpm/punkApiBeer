package com.pabelpm.punkapibeer.buildersAndroidTest

import com.pabelpm.punkapibeer.data.dto.HopDto
import com.pabelpm.punkapibeer.data.dto.IngredientsDto
import com.pabelpm.punkapibeer.data.dto.MaltDto

class IngredientsDtoBuilderAT {

    private var maltList = arrayListOf<MaltDto>()
    private var hopsList = arrayListOf<HopDto>()
    private var yeast = ""

    fun withMaltList(maltDtoList: ArrayList<MaltDto>): IngredientsDtoBuilderAT {
        this.maltList = maltDtoList
        return this
    }

    fun withHopsList(hopDtoList: ArrayList<HopDto>): IngredientsDtoBuilderAT {
        this.hopsList = hopDtoList
        return this
    }

    fun withYeast(yeast: String): IngredientsDtoBuilderAT {
        this.yeast = yeast
        return this
    }

    fun build(): IngredientsDto {
        return IngredientsDto(
            maltList, hopsList, yeast
        )
    }
}