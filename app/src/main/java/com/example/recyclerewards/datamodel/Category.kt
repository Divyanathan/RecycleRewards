package com.example.recyclerewards.datamodel

data class Category(val id: String, val name: String, val subCategory: List<SubCategory>)

data class SubCategory(
    val id: String,
    val name: String,
    val image: String,
    val isDegradble: Boolean
)