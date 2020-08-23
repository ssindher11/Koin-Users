package com.ssindher.kointutorial.di.module

import com.ssindher.kointutorial.data.api.ApiHelper
import com.ssindher.kointutorial.data.api.ApiHelperImpl
import com.ssindher.kointutorial.data.repository.MainRepository
import org.koin.dsl.module

val repoModule = module {
    single { MainRepository(get()) }
    single<ApiHelper> { return@single ApiHelperImpl(get()) }
}