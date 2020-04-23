package com.canal.android.test.ui.di

import com.canal.android.test.ui.programs.ProgramsViewModel
import com.canal.android.test.ui.programs.mapper.ProgramsUiMapper
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val uiProgramsViewModelModule = module {
    single {
        ProgramsUiMapper()
    }
    viewModel {
        ProgramsViewModel(
            getProgramsUseCase = get(),
            programsUiMapper = get()
        )
    }
}

val koinUiModules = listOf(
    uiProgramsViewModelModule
)
