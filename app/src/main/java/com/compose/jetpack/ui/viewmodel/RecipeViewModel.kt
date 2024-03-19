package com.compose.jetpack.ui.viewmodel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class RecipeViewModel: ViewModel() {
    private val _state = mutableStateOf<RecipeViewState>(RecipeViewState.Loading)

    val state: State<RecipeViewState> = _state

    fun processIntent(intent: RecipeViewIntent){
        when(intent){
         is RecipeViewIntent.LoadRandomeRecipe->loadRandomRecipe();
            is RecipeViewIntent.SearchRecipes ->searchRecipe(intent.query)
        }
    }
    private  fun loadRandomRecipe(){
        viewModelScope.launch {
            _state.value = RecipeViewState.Loading
            try {
                _state.value = RecipeViewState.Success("")
            }catch (e:Exception){
            _state.value = RecipeViewState.Error("Error fetching recipe")
            }
        }
    }

    private fun searchRecipe(query:String){
        viewModelScope.launch {
            _state.value = RecipeViewState.Loading
            try {
             _state.value = RecipeViewState.Success(
              ""
             )
            }catch (e:Exception){
                _state.value = RecipeViewState.Error("")
            }
        }
    }
}

