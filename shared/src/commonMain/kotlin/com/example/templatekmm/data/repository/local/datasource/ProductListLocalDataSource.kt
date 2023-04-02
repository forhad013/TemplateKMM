package com.example.templatekmm.data.repository.local.datasource

import com.example.templatekmm.entity.Product


interface ProductListLocalDataSource {
    fun getProductListFromLocal(): List<Product>
}