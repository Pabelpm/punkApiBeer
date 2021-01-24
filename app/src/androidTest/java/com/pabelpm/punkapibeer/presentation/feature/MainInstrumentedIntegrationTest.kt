package com.pabelpm.punkapibeer.presentation.feature

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import com.pabelpm.punkapibeer.R
import com.pabelpm.punkapibeer.presentation.features.MainActivity
import com.pabelpm.punkapibeer.presentation.utils.ViewUtils
import com.schibsted.spain.barista.assertion.BaristaListAssertions
import com.schibsted.spain.barista.assertion.BaristaVisibilityAssertions.assertDisplayed
import com.schibsted.spain.barista.interaction.BaristaListInteractions
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class MainInstrumentedIntegrationTest {

    @Rule
    @JvmField
    val mActivityRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.pabelpm.punkapibeer", appContext.packageName)
    }

    @Test
    fun us0002checkIfTitleIsShowingWithOutScrollProd() {
        ViewUtils.waitForIdle(ViewUtils.SLEEP.LARGE,"Wait for response")
        BaristaListAssertions.assertDisplayedAtPosition(
            R.id.beersRecyclerView,
            0,
            "Buzz"
        )
        BaristaListAssertions.assertListItemCount(R.id.beersRecyclerView, 25)
    }

    @Test
    fun us0002checkItemWithScrollProd() {
        ViewUtils.waitForIdle(ViewUtils.SLEEP.LARGE,"Wait for response")
        BaristaListInteractions.scrollListToPosition(R.id.beersRecyclerView, 24)
        BaristaListAssertions.assertDisplayedAtPosition(
            R.id.beersRecyclerView,
            24,
            "Bad Pixie"
        );
    }

}