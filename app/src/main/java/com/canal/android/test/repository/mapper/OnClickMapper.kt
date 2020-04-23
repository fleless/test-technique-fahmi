package com.canal.android.test.repository.mapper

import com.canal.android.test.repository.api.model.OnClickApi
import com.canal.android.test.domain.model.NavigateTo

class OnClickMapper : BaseDomainMapper<OnClickApi, NavigateTo>() {

    override fun toDomain(api: OnClickApi): NavigateTo {
        return when (api.displayTemplate) {
            DISPLAY_TEMPLATE_QUICKTIME -> api.toQuicktime()
            DISPLAY_TEMPLATE_DETAIL_PAGE -> api.toDetailPage()
            else -> throw NoSuchElementException(
                "This template is not handled : ${api.displayTemplate}"
            )
        }
    }

    private fun OnClickApi.toQuicktime(): NavigateTo {
        return NavigateTo.QuickTime(
            urlMedias = this.URLMedias!!
        )
    }

    private fun OnClickApi.toDetailPage(): NavigateTo {
        return NavigateTo.DetailPage(
            urlPage = this.URLPage
        )
    }

    companion object {
        private const val DISPLAY_TEMPLATE_QUICKTIME = "quicktime"
        private const val DISPLAY_TEMPLATE_DETAIL_PAGE = "detailPage"
    }

}