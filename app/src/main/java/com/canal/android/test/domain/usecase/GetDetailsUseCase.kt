package com.canal.android.test.domain.usecase

import com.canal.android.test.domain.Repository
import com.canal.android.test.domain.model.Details
import io.reactivex.Single

class GetDetailsUseCase(
    private val repository: Repository
) {

    operator fun invoke(url: String): Single<Details> {
        return repository.getProgramDetails(url)
    }
}