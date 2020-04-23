package com.canal.android.test.ui

import android.app.Application
import com.canal.android.test.repository.di.koinDataSourceModules
import com.canal.android.test.domain.di.koinDomainModules
import com.canal.android.test.ui.di.koinUiModules
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidFileProperties
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MyTestApplication : Application() {

    override fun onCreate() {

        // Koin
        startKoin {
            androidLogger()
            androidContext(this@MyTestApplication)
            androidFileProperties()
            modules(koinDataSourceModules)
            modules(koinDomainModules)
            modules(koinUiModules)
        }

        super.onCreate()
    }
}