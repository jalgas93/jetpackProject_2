package com.compose.jetpack.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.compose.jetpack.ui.nvgraph.Route

@Composable
fun MainScreen(navController: NavController) {

    /*    val state by recipeViewModel.state

        when (state) {
            is RecipeViewState.Loading -> LoadingComponent()
            is RecipeViewState.Success -> {
           *//*     val result = (state as RecipeViewState.Success).recipes
            SuccessComponent(results = result) { query->
                recipeViewModel.processIntent(RecipeViewIntent.SearchRecipes(query))
            }*//*

        }

        is RecipeViewState.Error -> {
        *//*    val message = (state as RecipeViewState.Error).message
            ErrorComponent(message = message) {
                recipeViewModel.processIntent(RecipeViewIntent.LoadRandomeRecipe)
            }*//*
        }
    }
    LaunchedEffect(Unit) {
       // recipeViewModel.processIntent(RecipeViewIntent.LoadRandomeRecipe)
    }*/



    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 50.dp)
    ) {
       // CircularProgressIndicator(modifier = Modifier.height(100.dp), color = Color.Gray)
        Button(onClick = {
                         navController.navigate(Route.DetailScreen.route)
        }, modifier = Modifier.align(Alignment.End)) {
            Text(text = "To DetailScreen", color = Color.White)
        }
    }
}