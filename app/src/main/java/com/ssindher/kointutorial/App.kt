package com.ssindher.kointutorial

import android.app.Application
import com.ssindher.kointutorial.di.module.appModule
import com.ssindher.kointutorial.di.module.repoModule
import com.ssindher.kointutorial.di.module.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(listOf(appModule, repoModule, viewModelModule))
        }
    }
}