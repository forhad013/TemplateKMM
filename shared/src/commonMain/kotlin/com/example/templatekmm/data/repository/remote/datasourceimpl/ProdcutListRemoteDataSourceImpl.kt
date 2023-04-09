package com.example.templatekmm.data.repository.remote.datasourceimpl

import com.example.templatekmm.data.model.ProductDTO
import com.example.templatekmm.data.repository.remote.datasource.ProductListRemoteDataSource
import com.example.templatekmm.data.util.APIConstants
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import io.ktor.http.*

class ProductListRemoteDataSourceImpl(
    private val httpClient: HttpClient
) : ProductListRemoteDataSource {

    override suspend fun getProductListFromRemote(url: String, page: Int): List<ProductDTO> {
        return httpClient.get(urlString = "${APIConstants.BASE_URL}$url") {
            contentType(ContentType.Application.Json)
        }.body()
    }
}
