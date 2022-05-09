package com.canal.android.test.ui.details

import com.canal.android.test.domain.usecase.GetDetailsUseCase
import com.canal.android.test.ui.common.BaseViewModel
import com.canal.android.test.ui.details.mapper.DetailsUIMapper
import com.canal.android.test.ui.details.model.PageDetailsUi
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.schedulers.Schedulers

class DetailsViewModel(
    private val getDetailsUseCase: GetDetailsUseCase,
    private val detailsUIMapper: DetailsUIMapper
) : BaseViewModel<PageDetailsUi>() {

    fun getDetails(url: String) {
        getDetailsUseCase(url)
            .subscribeOn(Schedulers.io())
            .map { details ->
                detailsUIMapper.toUi(details)
            }
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeBy(
                onSuccess = { pageDetailsUI ->
                    postUiData(pageDetailsUI)
                },
                onError = {
                    print("error $it")
                }
            )
    }
}