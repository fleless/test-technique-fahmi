package com.canal.android.test.domain.model

data class Details(
    val currentPage: CurrentPage,
    val detail: Detail,
)


data class CurrentPage(
    val BOName: String,
    val displayName: String,
    val displayTemplate: String,
    val path: String
)

data class Detail(
    val informations: Informations
)

data class Informations(
    val URLImage: String,
    val URLLogoChannel: String,
    val URLMedias: String,
    val consumptionPlatform: String,
    val contentID: String,
    val displayPersoButtons: Boolean,
    val editorialTitle: String,
    val fbkWatchTag: String,
    val idRevision: String,
    val sharingURL: String,
    val subtitle: String,
    val summary: String,
    val thirdTitle: String,
    val title: String,
    val type: String
)
