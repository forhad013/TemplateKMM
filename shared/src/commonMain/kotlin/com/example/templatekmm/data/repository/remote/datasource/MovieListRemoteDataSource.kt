package com.example.templatekmm.data.repository.remote.datasource

import com.example.templatekmm.data.model.ProductDTO

interface ProductListRemoteDataSource {

    suspend fun getProductListFromRemote(url: String, page: Int): List<ProductDTO>

}