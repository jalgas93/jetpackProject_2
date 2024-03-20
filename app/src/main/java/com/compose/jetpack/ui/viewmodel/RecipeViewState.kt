package com.compose.jetpack.ui.viewmodel

import com.compose.jetpack.model.Result

sealed class RecipeViewState {
    object Loading : RecipeViewState()
    data class Success(val recipes: List<Result>) : RecipeViewState()
    data class Error(val message: String) : RecipeViewState()
}
