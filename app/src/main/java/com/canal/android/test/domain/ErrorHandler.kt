package com.canal.android.test.domain

interface ErrorHandler {

    fun logError(
        tag: String,
        message: String,
        throwable: Throwable?
    )

}