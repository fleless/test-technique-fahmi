package com.canal.android.test.data.api.retrofit

import com.canal.android.test.data.api.model.DetailsApi
import com.canal.android.test.data.api.model.ProgramApi
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Url

interface ApiService {

    @GET
    fun getPrograms(
        @Url urlPage: String
    ): Single<List<ProgramApi>>

    @GET
    fun getDetails(
        @Url urlPage: String
    ): Single<DetailsApi>

}
