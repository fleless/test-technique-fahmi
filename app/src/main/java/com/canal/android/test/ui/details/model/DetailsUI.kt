package com.canal.android.test.ui.details.model

import com.canal.android.test.ui.programs.model.ProgramUi

data class PageDetailsUi(
    val details: DetailsUI
)

data class DetailsUI(
    val title: String,
    val type: String,
    val thirdTitle: String,
    val subtitle: String,
    val summary: String,
    val URLImage: String,
)
