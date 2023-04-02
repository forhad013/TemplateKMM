package com.example.templatekmm.data.repository.remote.datasourceimpl

import com.example.templatekmm.data.util.APIConstants
import com.example.templatekmm.data.factory.ApiService
import com.example.templatekmm.data.model.ProductDTO
import com.example.templatekmm.data.repository.remote.datasource.ProductListRemoteDataSource
import io.ktor.client.call.*
import io.ktor.client.request.*
import io.ktor.http.*


class ProductListRemoteDataSourceImpl() : ProductListRemoteDataSource {
    private val httpClient = ApiService().build()

    override suspend fun getProductListFromRemote(url: String, page: Int): List<ProductDTO> {
        return httpClient.get(urlString = "${APIConstants.BASE_URL}$url") {
            contentType(ContentType.Application.Json)
        }.body()
    }
}
