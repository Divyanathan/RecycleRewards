package com.example.recyclerewards.datamodel

data class Category(val id: String, val name: String, val subCategory: List<SubCategory>)

data class SubCategory(
    val id: String,
    val name: String,
    val image: String,
    val isDegradble: Boolean
)

data class SubCategoryContent(
    val id: String,
    val content: String,
    val image: String,
    val quantity: String,
    val cost: Long
)