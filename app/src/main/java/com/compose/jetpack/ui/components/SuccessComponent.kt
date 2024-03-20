package com.compose.jetpack.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.compose.jetpack.model.Result

//TODO List<Meal>
@Composable
fun SuccessComponent(results: List<Result>, onSearchClicked: (query: String) -> Unit) {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(
            text = "RecipeFinder",
            fontWeight = FontWeight(900),
            fontSize = 32.sp,
            fontFamily = FontFamily.Cursive,
            modifier = Modifier.padding(8.dp)
        )
        SearchComponent(onSearchClicked = onSearchClicked)
        RecipesList(result = results)
    }
}