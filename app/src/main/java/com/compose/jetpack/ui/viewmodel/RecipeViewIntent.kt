package com.compose.jetpack.ui.viewmodel

sealed class RecipeViewIntent {
    object LoadRandomeRecipe:RecipeViewIntent()
    data class SearchRecipes(val query:String):RecipeViewIntent()
}