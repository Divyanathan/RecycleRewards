package com.example.recyclerewards.repos

import com.example.recyclerewards.datamodel.Category

interface CategoryRepo {
    fun getCategory():List<Category>
}