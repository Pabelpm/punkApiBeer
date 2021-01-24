package com.pabelpm.punkapibeer.presentation.utils

import android.util.Log
import androidx.test.platform.app.InstrumentationRegistry

class ViewUtils {

    companion object {

        fun waitForIdle(sleep: SLEEP, reason: String) {
            Log.i("UI test", "waitForIdle - sleep: ${sleep.name}, reason: $reason")
            Thread.sleep(sleep.millis)
            InstrumentationRegistry.getInstrumentation().waitForIdleSync()
        }
    }

    enum class SLEEP(val millis: Long) {
        ONLY_DEBUG_TEST(5000),
        LARGE(1000),
        MEDIUM(500)
    }
}

