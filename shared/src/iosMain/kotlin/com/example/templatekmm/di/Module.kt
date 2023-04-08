package com.example.templatekmm.di


import com.example.templatekmm.data.factory.ApiService
import com.example.templatekmm.data.factory.DriverFactory
import org.koin.core.module.Module
import org.koin.dsl.module

actual fun platformModule(): Module = module {
    single { DriverFactory() }
    single { ApiService() }
}