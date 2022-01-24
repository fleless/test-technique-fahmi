package com.canal.android.test.data.mapper

import com.canal.android.test.data.api.model.ProgramApi
import com.canal.android.test.domain.model.Program

class ProgramMapper(
    private val onClickMapper: OnClickMapper
) : BaseDomainMapper<ProgramApi, Program>() {

    override fun toDomain(api: ProgramApi): Program {
        val navigateTo = onClickMapper.toDomain(api.onClick)
        return Program(
            id = api.contentID,
            title = api.title,
            subtitle = api.subtitle,
            urlImage = api.URLImage,
            urlLogoChannel = api.URLLogoChannel,
            navigateTo = navigateTo
        )
    }

}