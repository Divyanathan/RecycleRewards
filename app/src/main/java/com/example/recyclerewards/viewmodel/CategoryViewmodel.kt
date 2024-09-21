package com.example.recyclerewards.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.recyclerewards.datamodel.Category
import com.example.recyclerewards.repoimpl.CategoryRepoImpl
import com.example.recyclerewards.repos.CategoryRepo
import com.google.gson.Gson

class CategoryViewmodel :ViewModel() {
    val TAG = "CategoryViewmodel"
    val categoryRepo :CategoryRepo = CategoryRepoImpl()

    fun fetchCategory(): List<Category>{
        val list = categoryRepo.getCategory()
        Log.d(TAG, "fetchCategory: ${Gson().toJson(list)}")
        return list
    }
}