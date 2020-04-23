package com.canal.android.test.ui.programs.mapper

import com.canal.android.test.domain.model.Program
import com.canal.android.test.ui.common.BaseUiMapper
import com.canal.android.test.ui.programs.model.PageProgramsUi
import com.canal.android.test.ui.programs.model.ProgramUi

class ProgramsUiMapper : BaseUiMapper<List<Program>, PageProgramsUi>() {

    override fun toUi(domain: List<Program>): PageProgramsUi {
        val programsUi = domain.map { program ->
            ProgramUi(
                id = program.id,
                title = program.title,
                subtitle = program.subtitle,
                urlImage = program.urlImage,
                urlLogoChannel = program.urlLogoChannel,
                navigateTo = program.navigateTo
            )
        }
        return PageProgramsUi(
            programs = programsUi
        )
    }
}