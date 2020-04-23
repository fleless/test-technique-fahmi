package com.canal.android.test.repository.api.retrofit

import com.canal.android.test.repository.api.model.ProgramApi
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Url

interface ApiService {

    @GET
    fun getPrograms(
        @Url urlPage: String
    ): Single<List<ProgramApi>>

}
