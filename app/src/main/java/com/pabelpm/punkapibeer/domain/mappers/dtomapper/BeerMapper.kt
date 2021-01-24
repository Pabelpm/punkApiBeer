package com.pabelpm.punkapibeer.domain.mappers.dtomapper

import com.pabelpm.punkapibeer.domain.entities.Beer
import com.pabelpm.punkapibeer.domain.mappers.Mapper


class BeerMapper : Mapper<BeerDto, Beer>() {
    override fun map(source: BeerDto): Beer {
        return mapBeer(source)
    }

    private fun mapBeer(source: BeerDto): Beer = Beer(
        source.id,
        source.name,
        source.description
    )

}