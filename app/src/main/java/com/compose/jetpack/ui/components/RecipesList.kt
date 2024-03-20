package com.compose.jetpack.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.compose.jetpack.model.Result


//TODO List<Meal>
@Composable
fun RecipesList(result: List<Result>) {
    LazyColumn(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.White)) {
        items(result) {
            RecipeListItem(it)
        }
    }
}