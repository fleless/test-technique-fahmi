package com.canal.android.test.common.error

import android.util.Log
import com.canal.android.test.domain.ErrorHandler

class ErrorHandlerImpl : ErrorHandler {

    override fun logError(
        tag: String,
        message: String,
        throwable: Throwable?
    ) {
        Log.e(tag, message, throwable)
    }
}