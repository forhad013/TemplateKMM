package com.example.templatekmm.data.mapper

import com.project.templatekmm.database.Product

fun asDomainProductEntity(
    id: Long,
    title: String,
    price: Double,
    description: String,
    category: String,
    rate: Double,
    count: Double
): Product = Product(id, title, price, description, category, rate, count)