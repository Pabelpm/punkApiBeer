package com.pabelpm.punkapibeer.domain.mappers.viewmapper

import com.pabelpm.punkapibeer.data.dto.BeerDto
import com.pabelpm.punkapibeer.domain.entities.Beer
import com.pabelpm.punkapibeer.domain.mappers.Mapper
import com.pabelpm.punkapibeer.presentation.model.BeerView


class BeerViewMapper : Mapper<Beer, BeerView>() {
    override fun map(source: Beer): BeerView {
        return mapBeer(source)
    }

    private fun mapBeer(source: Beer): BeerView = BeerView(
        source.name,
        source.description
    )

}