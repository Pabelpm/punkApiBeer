package com.pabelpm.punkapibeer.domain.mappers


import com.pabelpm.punkapibeer.builders.BeerDtoBuilder
import com.pabelpm.punkapibeer.domain.entities.Beer
import com.pabelpm.punkapibeer.domain.mappers.dtomapper.BeerMapper
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class BeerMapperTest {

    private lateinit var beerMapper: BeerMapper
    private var beerDto = BeerDtoBuilder().build()

    @Before
    fun setUp() {
        beerMapper = BeerMapper()
    }

    @Test
    fun checkBindsFields() {
        val beer: Beer = beerMapper.transform(beerDto)
        Assert.assertEquals(1, beer.id)
        Assert.assertEquals("Buzz", beer.name)
        Assert.assertEquals("A light, crisp and bitter IPA brewed with English and American hops. A small batch brewed only once.", beer.description)

    }
}