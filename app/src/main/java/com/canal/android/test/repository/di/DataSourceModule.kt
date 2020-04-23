package com.canal.android.test.repository.di

import com.canal.android.test.repository.ApiDataSource
import com.canal.android.test.repository.RepositoryImpl
import com.canal.android.test.repository.api.ApiDataSourceImpl
import com.canal.android.test.repository.mapper.OnClickMapper
import com.canal.android.test.repository.mapper.ProgramMapper
import com.canal.android.test.repository.api.retrofit.ApiRetrofitFactory
import com.canal.android.test.domain.Repository
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module


val apiRetrofitModule = module {
    single {
        ApiRetrofitFactory(androidContext()).buildApiService(
            ApiRetrofitFactory(androidContext()).buildApiRetrofit()
        )
    }
}

val apiDataSourceModule = module {
    single {
        ApiDataSourceImpl(
            apiService = get()
        ) as ApiDataSource
    }
}

val apiMapperModule = module {
    single {
        OnClickMapper()
    }
    single {
        ProgramMapper(onClickMapper = get())
    }
}

val repositoryModule = module {
    single {
        RepositoryImpl(
            apiDataSource = get(),
            programMapper = get()
        ) as Repository
    }
}

val koinDataSourceModules = listOf(
    apiRetrofitModule,
    apiDataSourceModule,
    apiMapperModule,
    repositoryModule
)