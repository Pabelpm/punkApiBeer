package com.pabelpm.punkapibeer.presentation.utils

import android.content.Context
import android.view.View
import android.widget.Toast

fun View.visible() {
    visibility = View.VISIBLE
}

fun View.invisible() {
    visibility = View.INVISIBLE
}

fun View.gone() {
    visibility = View.GONE
}

fun View.isVisible() = visibility == View.VISIBLE

fun View.isInvisible() = visibility == View.INVISIBLE

fun View.isGone() = visibility == View.GONE

fun View.setSafeOnClickListener(
    safeInterval: SafeInterval = SafeInterval.SAFE,
    onSafeClick: (View) -> Unit
) {
    val safeClickListener = SafeClickListener(safeInterval) {
        onSafeClick(it)
    }
    setOnClickListener(safeClickListener)
}

fun Context.toast(message: Int): Toast = Toast
    .makeText(this, message, Toast.LENGTH_SHORT)
    .apply {
        show()
    }

fun Context.toast(message: CharSequence): Toast = Toast
    .makeText(this, message, Toast.LENGTH_SHORT)
    .apply {
        show()
    }

fun Context.toastError(message: CharSequence): Toast = Toast
    .makeText(this, message, Toast.LENGTH_LONG)
    .apply {
        show()
    }

fun String.removeAllSpaces(): String = replace("\\s".toRegex(), "")



