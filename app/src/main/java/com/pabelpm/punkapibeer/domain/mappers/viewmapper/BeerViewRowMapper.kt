package com.pabelpm.punkapibeer.domain.mappers.viewmapper

import com.pabelpm.punkapibeer.domain.entities.Beer
import com.pabelpm.punkapibeer.domain.mappers.Mapper
import com.pabelpm.punkapibeer.presentation.model.BeerViewRow


class BeerViewRowMapper : Mapper<Beer, BeerViewRow>() {
    override fun map(source: Beer): BeerViewRow {
        return mapBeer(source)
    }

    private fun mapBeer(source: Beer): BeerViewRow = BeerViewRow(
        source.id,
        source.name,
        source.description,
        source.imageUrl
    )

}