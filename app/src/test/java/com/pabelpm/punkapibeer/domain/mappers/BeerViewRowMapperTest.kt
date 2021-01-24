package com.pabelpm.punkapibeer.domain.mappers


import com.pabelpm.punkapibeer.builders.BeerDtoBuilder
import com.pabelpm.punkapibeer.domain.mappers.dtomapper.BeerMapper
import com.pabelpm.punkapibeer.domain.mappers.viewmapper.BeerViewRowMapper
import com.pabelpm.punkapibeer.presentation.model.BeerViewRow
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class BeerViewRowMapperTest {

    private lateinit var beerViewRowMapper: BeerViewRowMapper
    private var beer = BeerMapper().transform(BeerDtoBuilder().build())

    @Before
    fun setUp() {
        beerViewRowMapper = BeerViewRowMapper()
    }

    @Test
    fun checkBindsFields() {
        val beerViewRow: BeerViewRow = beerViewRowMapper.transform(beer)
        Assert.assertEquals("Buzz", beerViewRow.name)
        Assert.assertEquals("A light, crisp and bitter IPA brewed with English and American hops. A small batch brewed only once.", beerViewRow.description)

    }
}