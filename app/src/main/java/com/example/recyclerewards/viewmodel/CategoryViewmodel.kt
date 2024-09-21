package com.example.recyclerewards.viewmodel

import androidx.lifecycle.ViewModel
import com.example.recyclerewards.datamodel.Category
import com.example.recyclerewards.repoimpl.CategoryRepoImpl
import com.example.recyclerewards.repos.CategoryRepo

class CategoryViewmodel :ViewModel() {

    val categoryRepo :CategoryRepo = CategoryRepoImpl()

    fun fetchCategory(): List<Category>{
        return categoryRepo.getCategory()
    }
}