package com.example.test0421.product

data class Product(
    val id: Int,
    val name: String,
    val price: Int,
    val description: String?,
    val imageUrl: String? = null
)