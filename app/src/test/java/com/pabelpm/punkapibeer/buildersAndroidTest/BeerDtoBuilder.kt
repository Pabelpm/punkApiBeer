package com.pabelpm.punkapibeer.buildersAndroidTest

import com.pabelpm.punkapibeer.data.dto.BeerDto

class BeerDtoBuilder {

    private var id = 1
    private var name = "Buzz"
    private var tagline = "A Real Bitter Experience."
    private var first_brewed = "09/2007"
    private var description =
        "A light, crisp and bitter IPA brewed with English and American hops. A small batch brewed only once."
    private var image_url = "https://images.punkapi.com/v2/keg.png"
    private var abv = 4.5
    private var ibu = 60
    private var target_fg = 1010
    private var target_og = 1044
    private var ebc = 20
    private var srm = 10
    private var ph = 4.4
    private var attenuation_level = 75
    private var volume = VolumeDtoBuilder().withValue(20).withUnit("litres").build()
    private var boil_dvolume = BoilVolumeDtoBuilder().withValue(25).withUnit("litres").build()
    private var method = MethodDtoBuilder().withMashTempList(
        arrayListOf(
            MashTempDtoBuilder().withTemp(
                TempDtoBuilder().withValue(64).withUnit("celsius").build()
            ).withDuration(75).build()
        )
    ).build()
    private var ingredients = IngredientsDtoBuilder().withMaltList(
        arrayListOf(
            MaltDtoBuilder().withName("Maris Otter Extra Pale")
                .withAmount(AmountDtoBuilder().withValue(3.3).withUnit("kilograms").build()).build()
        )
    ).withHopsList(
        arrayListOf(
            HopDtoBuilder().withName("Fuggles")
                .withAmount(AmountDtoBuilder().withValue(25.0).withUnit("grams").build())
                .withAdd("start").withAttribute("bitter").build()
        )
    ).withYeast("Wyeast 1056 - American Ale™").build()

    private var food_pairing = arrayListOf(
        "Spicy chicken tikka masala",
        "Grilled chicken quesadilla",
        "Caramel toffee cake")

    private var brewers_tips = "The earthy and floral aromas from the hops can be overpowering. Drop a little Cascade in at the end of the boil to lift the profile with a bit of citrus.\""
    private var contributed_by = "Sam Mason <samjbmason>"


    fun build(): BeerDto {
        return BeerDto(
            id = id,
            name = name,
            tagline = tagline,
            firstBrewed = first_brewed,
            description = description,
            imageUrl = image_url,
            abv = abv,
            ibu = ibu.toDouble(),
            targetFg = target_fg,
            targetOg = target_og.toDouble(),
            ebc = ebc,
            srm = srm.toDouble(),
            ph = ph,
            attenuationLevel = attenuation_level.toDouble(),
            volume = volume,
            boilVolume = boil_dvolume,
            method = method,
            ingredients = ingredients,
            foodPairing = food_pairing,
            brewersTips = brewers_tips,
            contributedBy =contributed_by,
        )
    }
}