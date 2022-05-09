package com.canal.android.test.data

import com.canal.android.test.data.api.model.DetailsApi
import com.canal.android.test.data.api.model.ProgramApi
import io.reactivex.Single

interface ApiDataSource {

    fun getPrograms(url: String): Single<List<ProgramApi>>

    fun getProgramDetails (url: String) : Single<DetailsApi>
}