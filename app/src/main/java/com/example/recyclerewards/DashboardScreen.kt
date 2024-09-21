package com.example.recyclerewards

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.recyclerewards.datamodel.Category
import com.example.recyclerewards.datamodel.SubCategory

@Preview
@Composable
fun CategoryListScreen(categories: List<Category>) {
    LazyColumn {
        items(categories.size) { index ->
            CategoryCard(categories[index])
        }
    }
}

@Composable
fun CategoryCard(category: Category) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        elevation = CardDefaults.cardElevation(defaultElevation= 2.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = category.name, style = MaterialTheme.typography.bodyMedium)
            Spacer(modifier = Modifier.height(8.dp))
            LazyRow {
                items(category.subCategory.size) { index ->
                    SubCategoryItem(category.subCategory[index])
                }
            }
        }
    }
}

@Composable
fun SubCategoryItem(subCategory: SubCategory) {
    Column(
        modifier = Modifier
            .padding(8.dp)
            .width(100.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
//        AsyncImage(
//            model = subCategory.image,
//            contentDescription = subCategory.name,
//            modifier = Modifier.size(80.dp)
//        )
        Text(text = subCategory.name, style = MaterialTheme.typography.bodyMedium)
        if (subCategory.isDegradble) {
//            Icon(
//                imageVector = Icons.Filled.,
//                contentDescription = "Degradable",
//                modifier = Modifier.size(16.dp),
//                tint = Color.Green
//            )
        }
    }
}