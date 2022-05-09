package com.canal.android.test.data.mapper

import com.canal.android.test.data.api.model.DetailsApi
import com.canal.android.test.domain.model.CurrentPage
import com.canal.android.test.domain.model.Detail
import com.canal.android.test.domain.model.Details
import com.canal.android.test.domain.model.Informations

class DetailsMapper() : BaseDomainMapper<DetailsApi, Details>() {

    override fun toDomain(api: DetailsApi) = Details(
            currentPage = CurrentPage(
                BOName = api.currentPage.BOName,
                displayName = api.currentPage.displayName,
                displayTemplate = api.currentPage.displayTemplate,
                path = api.currentPage.path
            ),
            detail = Detail(
                informations = Informations(
                    URLImage = api.detail.informations.URLImage,
                    URLLogoChannel = api.detail.informations.URLLogoChannel,
                    URLMedias = api.detail.informations.URLMedias,
                    consumptionPlatform = api.detail.informations.consumptionPlatform,
                    contentID = api.detail.informations.contentID,
                    displayPersoButtons = api.detail.informations.displayPersoButtons,
                    editorialTitle = api.detail.informations.editorialTitle,
                    fbkWatchTag = api.detail.informations.fbkWatchTag,
                    idRevision = api.detail.informations.idRevision,
                    sharingURL = api.detail.informations.sharingURL,
                    subtitle = api.detail.informations.subtitle,
                    summary = api.detail.informations.summary,
                    thirdTitle = api.detail.informations.thirdTitle,
                    title = api.detail.informations.title,
                    type = api.detail.informations.type,
                )
            )
        )
    }