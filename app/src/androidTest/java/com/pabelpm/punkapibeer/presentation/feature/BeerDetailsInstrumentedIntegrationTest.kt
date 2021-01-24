package com.pabelpm.punkapibeer.presentation.feature

import android.content.Context
import android.content.Intent
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import com.google.gson.Gson
import com.pabelpm.punkapibeer.R
import com.pabelpm.punkapibeer.buildersAndroidTest.BeerDtoBuilderAT
import com.pabelpm.punkapibeer.domain.mappers.dtomapper.BeerMapper
import com.pabelpm.punkapibeer.domain.mappers.viewmapper.BeerViewDetailsMapper
import com.pabelpm.punkapibeer.presentation.features.BeerDetailsActivity
import com.pabelpm.punkapibeer.presentation.model.BeerViewDetails
import com.pabelpm.punkapibeer.presentation.utils.Matchers
import com.pabelpm.punkapibeer.presentation.views.ValueComponent
import com.schibsted.spain.barista.assertion.BaristaVisibilityAssertions.assertDisplayed
import com.schibsted.spain.barista.interaction.BaristaScrollInteractions.scrollTo
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class BeerDetailsInstrumentedIntegrationTest {

    private val EXTRA_BEER_DETAILS: String = "EXTRA_BEER_DETAILS"
    val beerViewDetails: BeerViewDetails = BeerViewDetailsMapper().transform(
        BeerMapper().transform(
            BeerDtoBuilderAT().build()
        )
    )

    @get:Rule
    val mActivityRule: ActivityTestRule<BeerDetailsActivity> =
        object : ActivityTestRule<BeerDetailsActivity>(BeerDetailsActivity::class.java) {
            override fun getActivityIntent(): Intent {
                val targetContext: Context =
                    InstrumentationRegistry.getInstrumentation().targetContext
                val result = Intent(targetContext, BeerDetailsActivity::class.java)
                result.putExtra(EXTRA_BEER_DETAILS, Gson().toJson(beerViewDetails))
                return result
            }
        }

    @Test
    fun checkIfTitleIsShowingWithOutScrollProd() {
        checkInterface()
    }

    private fun checkInterface() {
        assertDisplayed(R.id.nameDetailsBeerTextView, beerViewDetails.name)
        assertDisplayed(R.id.descriptionDetailsBeerTextView, beerViewDetails.description)
        scrollTo("Volume")
        Matchers.assertValueComponentView(
            R.id.volumeValueComponent,
            ValueComponent.ValueComponentEntity(
                "Volume",
                beerViewDetails.volume.value,
                beerViewDetails.volume.unit
            )
        )
        scrollTo("Boil Volume")
        Matchers.assertValueComponentView(
            R.id.boilVolumeValueComponent,
            ValueComponent.ValueComponentEntity(
                "Boil Volume",
                beerViewDetails.boilVolume.value,
                beerViewDetails.boilVolume.unit
            )
        )
    }
}