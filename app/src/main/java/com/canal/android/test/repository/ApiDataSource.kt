package com.canal.android.test.repository

import com.canal.android.test.repository.api.model.ProgramApi
import io.reactivex.Single

interface ApiDataSource {

    fun getPrograms(url: String): Single<List<ProgramApi>>
}