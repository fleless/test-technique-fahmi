package com.canal.android.test.domain.model

data class Program(
    val id: String,
    val title: String,
    val subtitle: String,
    val urlImage: String,
    val urlLogoChannel: String?,
    val navigateTo: NavigateTo
)