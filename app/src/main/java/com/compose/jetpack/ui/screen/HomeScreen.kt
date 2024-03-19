package com.compose.jetpack.ui.screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import com.compose.jetpack.ui.components.LoadingComponent
import com.compose.jetpack.ui.viewmodel.RecipeViewIntent
import com.compose.jetpack.ui.viewmodel.RecipeViewModel
import com.compose.jetpack.ui.viewmodel.RecipeViewState

@Composable
fun HomeScreen(recipeViewModel: RecipeViewModel) {

    val state by recipeViewModel.state

    when(state){
        is RecipeViewState.Loading->LoadingComponent()
        is RecipeViewState.Success->{
            val recipes = (state as RecipeViewState.Success).recipes
            SuccessComponent(recipes = recipes){
                recipeViewModel.processIntent(RecipeViewIntent.SearchRecipes(it))
            }

        }
        is RecipeViewState.Error -> {
            val message = (state as RecipeViewState.Error).message
            ErrorComponent(message = message){
                recipeViewModel.processIntent(RecipeViewIntent.LoadRandomeRecipe)
            }
        }
    }

}