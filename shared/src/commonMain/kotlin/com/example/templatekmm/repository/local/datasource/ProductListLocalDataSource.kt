package com.example.templatekmm.repository.local.datasource

import com.project.templatekmm.database.Product

interface ProductListLocalDataSource {
    fun getProductListFromLocal(): List<Product>
}