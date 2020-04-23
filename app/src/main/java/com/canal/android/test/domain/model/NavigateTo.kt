package com.canal.android.test.domain.model

sealed class NavigateTo {

    data class QuickTime(
        val urlMedias: String
    ) : NavigateTo()

    data class DetailPage(
        val urlPage: String
    ) : NavigateTo()
}