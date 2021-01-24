package com.pabelpm.punkapibeer.domain.mappers


import com.pabelpm.punkapibeer.builders.BeerDtoBuilder
import com.pabelpm.punkapibeer.domain.entities.Beer
import com.pabelpm.punkapibeer.domain.mappers.dtomapper.BeerMapper
import com.pabelpm.punkapibeer.domain.mappers.viewmapper.BeerViewMapper
import com.pabelpm.punkapibeer.presentation.model.BeerView
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class BeerViewMapperTest {

    private lateinit var beerViewMapper: BeerViewMapper
    private var beer = BeerMapper().transform(BeerDtoBuilder().build())

    @Before
    fun setUp() {
        beerViewMapper = BeerViewMapper()
    }

    @Test
    fun checkBindsFields() {
        val beerView: BeerView = beerViewMapper.transform(beer)
        Assert.assertEquals("Buzz", beerView.name)
        Assert.assertEquals("A light, crisp and bitter IPA brewed with English and American hops. A small batch brewed only once.", beerView.description)

    }
}