package com.example.recyclerewards.ui.theme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import com.example.recyclerewards.CategoryListScreen
import com.example.recyclerewards.viewmodel.CategoryViewmodel

class CategoryActivity : ComponentActivity() {

    private val categoryViewmodel: CategoryViewmodel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RecycleRewardsTheme {
                CategoryListScreen(categories = categoryViewmodel.fetchCategory())
            }
        }
    }
}

