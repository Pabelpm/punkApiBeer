package com.pabelpm.punkapibeer.domain.mappers.viewmapper

import com.pabelpm.punkapibeer.domain.entities.Beer
import com.pabelpm.punkapibeer.domain.mappers.Mapper
import com.pabelpm.punkapibeer.presentation.model.BeerViewDetails
import com.pabelpm.punkapibeer.presentation.model.BeerViewRow


class BeerViewDetailsMapper : Mapper<Beer, BeerViewDetails>() {
    override fun map(source: Beer): BeerViewDetails {
        return mapBeer(source)
    }

    private fun mapBeer(source: Beer): BeerViewDetails = BeerViewDetails(

        source.name,
        source.description,
        source.imageUrl
    )

}