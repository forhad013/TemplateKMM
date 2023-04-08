package com.example.templatekmm.data.repository.remote.datasource

import com.example.templatekmm.data.model.ProductDTO
import io.ktor.client.*

interface ProductListRemoteDataSource {
    suspend fun getProductListFromRemote(url: String, page: Int): List<ProductDTO>

}