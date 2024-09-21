package com.example.recyclerewards.repoimpl

import com.example.recyclerewards.datamodel.Category
import com.example.recyclerewards.datamodel.SubCategory
import com.example.recyclerewards.repos.CategoryRepo
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class CategoryRepoImpl: CategoryRepo {
    override fun getCategory(): List<Category> {
        return getSampleData()
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

        val category = Category(id = "1", name = "Domestic", subCategoryList)
        val categoryList = ArrayList<Category>()
        categoryList.add(category)
        return categoryList
    }

    fun getSampleData():List<Category>{
        val sampleData =  "[\n" +
                "  {\n" +
                "    \"id\": \"1\",\n" +
                "    \"name\": \"Domestic\",\n" +
                "    \"subCategory\": [\n" +
                "      {\n" +
                "        \"id\": \"1\",\n" +
                "        \"image\": \"image\",\n" +
                "        \"isDegradble\": false,\n" +
                "        \"name\": \"Plastic\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": \"2\",\n" +
                "        \"image\": \"image\",\n" +
                "        \"isDegradble\": false,\n" +
                "        \"name\": \"Glasses\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": \"3\",\n" +
                "        \"image\": \"image\",\n" +
                "        \"isDegradble\": false,\n" +
                "        \"name\": \"E-Waste\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": \"4\",\n" +
                "        \"image\": \"image\",\n" +
                "        \"isDegradble\": false,\n" +
                "        \"name\": \"Kitchen-Wast\"\n" +
                "      }\n" +
                "    ]\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"2\",\n" +
                "    \"name\": \"Medical\",\n" +
                "    \"subCategory\": [\n" +
                "      {\n" +
                "        \"id\": \"4\",\n" +
                "        \"image\": \"image\",\n" +
                "        \"isDegradble\": false,\n" +
                "        \"name\": \"Hazardous\"\n" +
                "      }\n" +
                "    ]\n" +
                "  }\n" +
                "]"

        val listType = object : TypeToken<List<Category>>(){}.type
        val myObject = Gson().fromJson<List<Category>>(sampleData, listType)
        return myObject
    }

}