package com.canal.android.test.ui.programs.model

import com.canal.android.test.domain.model.NavigateTo

data class PageProgramsUi(
    val programs: List<ProgramUi>
)

data class ProgramUi(
    val id: String,
    val title: String,
    val subtitle: String,
    val urlImage: String,
    val urlLogoChannel: String?,
    val navigateTo: NavigateTo
)