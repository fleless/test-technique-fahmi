package com.canal.android.test.ui.details.mapper

import com.canal.android.test.domain.model.Details
import com.canal.android.test.ui.common.BaseUiMapper
import com.canal.android.test.ui.common.ImageHelper
import com.canal.android.test.ui.details.model.DetailsUI
import com.canal.android.test.ui.details.model.PageDetailsUi

class DetailsUIMapper : BaseUiMapper<Details, PageDetailsUi>() {

    override fun toUi(domain: Details): PageDetailsUi {
        return PageDetailsUi(
            details = DetailsUI(
                title = domain.detail.informations.title,
                type = domain.detail.informations.type,
                thirdTitle = domain.detail.informations.thirdTitle,
                subtitle = domain.detail.informations.subtitle,
                summary = domain.detail.informations.summary,
                URLImage = domain.detail.informations.URLImage
            )
        )
    }

}
