package com.pabelpm.punkapibeer.presentation.utils

import android.os.SystemClock
import android.view.View

class SafeClickListener(
    private var safeInterval: SafeInterval,
    private val onSafeCLick: (View) -> Unit
) : View.OnClickListener {

    private var lastTimeClicked: Long = 0

    override fun onClick(v: View) {
        if (SystemClock.elapsedRealtime() - lastTimeClicked < safeInterval.time) {
            return
        }
        lastTimeClicked = SystemClock.elapsedRealtime()
        onSafeCLick(v)
    }
}

enum class SafeInterval(val time: Int) {
    NONE(0),
    MODERATE(300),
    SAFE(500)
}