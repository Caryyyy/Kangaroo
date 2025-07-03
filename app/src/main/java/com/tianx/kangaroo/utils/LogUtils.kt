package com.tianx.kangaroo.utils

import android.util.Log

object LogUtils {

    private const val TAG = "KangarooApp"

    fun d(message: String) {
        Log.d(TAG, message)
    }

    fun e(message: String, throwable: Throwable? = null) {
        Log.e(TAG, message, throwable)
    }
}