package com.example.templatekmm.di

import com.example.templatekmm.data.repository.remote.datasource.ProductListRemoteDataSource
import com.example.templatekmm.data.repository.remote.datasourceimpl.ProductListRemoteDataSourceImpl
import org.koin.dsl.module

val dataSourceModule = module {
    single<ProductListRemoteDataSource> { ProductListRemoteDataSourceImpl(get()) }
    single<ProductListRemoteDataSource> { ProductListRemoteDataSourceImpl(get()) }
}