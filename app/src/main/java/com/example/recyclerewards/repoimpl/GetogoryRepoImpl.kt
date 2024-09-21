package com.example.recyclerewards.repoimpl

import com.example.recyclerewards.datamodel.Category
import com.example.recyclerewards.datamodel.SubCategory
import com.example.recyclerewards.repos.GategoryRepo

class GetogoryRepoImpl: GategoryRepo {
    override fun getGetegory(): List<Category> {
        return getSampleGetegory()
    }

    fun getSampleGetegory(): List<Category> {

        val list = ArrayList<Category>()
        val subCategoryList = ArrayList<SubCategory>()
        val subCategory =
            SubCategory(id = "1", name = "Plastic", image = "image", isDegradble = false)
        val subCategory2 =
            SubCategory(id = "2", name = "Glasses", image = "image", isDegradble = false)
        val subCategory3 =
            SubCategory(id = "3", name = "E-Waste", image = "image", isDegradble = false)
        val subCategory4 =
            SubCategory(id = "4", name = "Kitchen-Wast", image = "image", isDegradble = false)
        subCategoryList.add(subCategory)
        subCategoryList.add(subCategory2)
        subCategoryList.add(subCategory3)
        subCategoryList.add(subCategory4)

        val category = Category(id = "", name = "Domestic", subCategoryList)
        val categoryList = ArrayList<Category>()
        categoryList.add(category)
        return categoryList
    }

}