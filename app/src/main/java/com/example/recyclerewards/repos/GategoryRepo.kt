package com.example.recyclerewards.repos

import com.example.recyclerewards.datamodel.Category

interface GategoryRepo {
    fun getGetegory():List<Category>
}