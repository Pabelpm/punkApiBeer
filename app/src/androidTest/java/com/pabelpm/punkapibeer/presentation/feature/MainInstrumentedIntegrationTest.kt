package com.pabelpm.punkapibeer.presentation.feature

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import com.pabelpm.punkapibeer.R
import com.pabelpm.punkapibeer.presentation.features.MainActivity
import com.schibsted.spain.barista.assertion.BaristaVisibilityAssertions.assertDisplayed
import org.junit.Assert.assertEquals
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
    fun checkIfHelloWorldIsVisible() {
        //Test against prod
        assertDisplayed("Hello World!")
        assertDisplayed(R.id.helloWorld)
    }
}