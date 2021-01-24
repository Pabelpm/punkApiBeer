package com.pabelpm.punkapibeer.presentation.feature

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import com.pabelpm.punkapibeer.presentation.features.MainActivity
import com.pabelpm.punkapibeer.presentation.utils.FileReader
import com.pabelpm.punkapibeer.presentation.utils.MockServerRule
import junit.framework.Assert.assertEquals
import okhttp3.mockwebserver.Dispatcher
import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.RecordedRequest
import org.junit.After
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
class MainInstrumentedMockTest {

    //espresso rule which tells which activity to start
    @get:Rule
    val activityRule = ActivityTestRule(MainActivity::class.java, true, false)

    @get:Rule
    val mMockServerRule = MockServerRule()


    @Before
    fun setup() {
        //setup mockweb server
        mMockServerRule.server().dispatcher = getDispatcher()
        activityRule.launchActivity(null)
    }

    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.pabelpm.punkapibeer", appContext.packageName)
    }



    @After
    fun teardown() {
        mMockServerRule.server().shutdown()
    }

    private fun getDispatcher(): Dispatcher {
        return object : Dispatcher() {
            @Throws(InterruptedException::class)
            override fun dispatch(request: RecordedRequest): MockResponse {
                return MockResponse().setResponseCode(200)
                    .setBody(FileReader.readStringFromFile("beers_page_one_success_response.json"))
            }
        }
    }
}