package com.canal.android.test.repository

import com.canal.android.test.repository.mapper.ProgramMapper
import com.canal.android.test.domain.Repository
import com.canal.android.test.domain.model.Program
import io.reactivex.Single

class RepositoryImpl(
    private val apiDataSource: ApiDataSource,
    private val programMapper: ProgramMapper
) : Repository {

    override fun getPrograms(url: String): Single<List<Program>> {
        return apiDataSource.getPrograms(url)
            .map { programsApi ->
                programsApi.map { programApi ->
                    programMapper.toDomain(programApi)
                }
            }
    }

}