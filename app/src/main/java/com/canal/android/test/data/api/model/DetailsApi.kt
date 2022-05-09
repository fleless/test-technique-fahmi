package com.canal.android.test.data.api.model

data class DetailsApi(
    val currentPage: CurrentPage,
    val detail: Detail,
    val tracking: Tracking
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

data class Tracking(
    val omniture: Omniture
)

data class Omniture(
    val channel: String,
    val eVar30: String,
    val eVar39: String,
    val pageName: String,
    val prop10: String,
    val prop11: String,
    val prop12: String,
    val prop19: String,
    val prop4: String,
    val prop5: String,
    val prop6: String,
    val prop7: String
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
