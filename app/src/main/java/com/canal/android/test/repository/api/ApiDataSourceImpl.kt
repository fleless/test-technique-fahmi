package com.canal.android.test.repository.api

import com.canal.android.test.repository.ApiDataSource
import com.canal.android.test.repository.api.model.ProgramApi
import com.canal.android.test.repository.api.retrofit.ApiService
import io.reactivex.Single

class ApiDataSourceImpl(
    private val apiService: ApiService
) : ApiDataSource {

    override fun getPrograms(url: String): Single<List<ProgramApi>> {
        return apiService.getPrograms(url)
    }

}