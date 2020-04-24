package com.canal.android.test.ui.programs.mapper

import com.canal.android.test.domain.model.Program
import com.canal.android.test.ui.common.BaseUiMapper
import com.canal.android.test.ui.common.ImageHelper
import com.canal.android.test.ui.programs.model.PageProgramsUi
import com.canal.android.test.ui.programs.model.ProgramUi

class ProgramsUiMapper : BaseUiMapper<List<Program>, PageProgramsUi>() {

    override fun toUi(domain: List<Program>): PageProgramsUi {
        val programsUi = domain.map { program ->
            val urlImage = ImageHelper.setImageResolution(program.urlImage, 480, 270)
            val urlLogoChannel = ImageHelper.setImageResolution(program.urlLogoChannel, 80, 60)
            ProgramUi(
                id = program.id,
                title = program.title,
                subtitle = program.subtitle,
                urlImage = urlImage ?: "",
                urlLogoChannel = urlLogoChannel,
                navigateTo = program.navigateTo
            )
        }
        return PageProgramsUi(
            programs = programsUi
        )
    }
}