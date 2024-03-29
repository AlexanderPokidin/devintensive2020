package ru.skillbranch.devintensive

import androidx.test.platform.app.InstrumentationRegistry
import android.app.Activity
import android.content.pm.ActivityInfo
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.core.view.iterator

fun findEditTextView(view: View): EditText? {
    if (view is EditText)
        return view
    else {
        if (view is ViewGroup)
            for (item in view.iterator()) {
                val child = findEditTextView(item)
                if (child != null) return child
            }
    }
    return null
}

fun rotateScreen(activity: Activity, isLandscape: Boolean){
    InstrumentationRegistry.getInstrumentation().runOnMainSync {
        activity.requestedOrientation = if (isLandscape) ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE else ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
    }
    InstrumentationRegistry.getInstrumentation().waitForIdleSync()
    Thread.sleep(2000)
}