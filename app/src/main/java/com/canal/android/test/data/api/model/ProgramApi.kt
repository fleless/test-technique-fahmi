package com.canal.android.test.data.api.model

data class ProgramApi(
    val type: String,
    val contentID: String,
    val title: String,
    val subtitle: String,
    val URLImage: String,
    val URLLogoChannel: String?,
    val onClick: OnClickApi
)
