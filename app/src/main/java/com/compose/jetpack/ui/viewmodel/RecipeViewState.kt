package com.compose.jetpack.ui.viewmodel

sealed class RecipeViewState {
    object Loading : RecipeViewState()
    data class Success(val recipes: List<String>) : RecipeViewState()
    data class Error(val message: String) : RecipeViewState()
}
