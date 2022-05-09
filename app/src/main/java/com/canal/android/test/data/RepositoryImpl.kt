package com.canal.android.test.data

import com.canal.android.test.data.mapper.DetailsMapper
import com.canal.android.test.data.mapper.ProgramMapper
import com.canal.android.test.domain.Repository
import com.canal.android.test.domain.model.Details
import com.canal.android.test.domain.model.Program
import io.reactivex.Single

class RepositoryImpl(
    private val apiDataSource: ApiDataSource,
    private val programMapper: ProgramMapper,
    private val detailsMapper: DetailsMapper

) : Repository {

    override fun getPrograms(url: String): Single<List<Program>> {
        return apiDataSource.getPrograms(url)
            .map { programsApi ->
                programsApi.map { programApi ->
                    programMapper.toDomain(programApi)
                }
            }
    }

    override fun getProgramDetails(url: String): Single<Details> {
        return apiDataSource.getProgramDetails(url)
            .map { detailsApi ->
                detailsMapper.toDomain(detailsApi)
            }
    }
}