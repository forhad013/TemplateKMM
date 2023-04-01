package com.example.templatekmm.data.database

data class Product(
    val id: Long,
    val title: String,
    val price: Double,
    val description: String,
    val category: String,
    val rate: Double,
    val count: Double
)