package com.compose.jetpack.ui.viewmodel

import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.compose.jetpack.di.AppModule
import com.compose.jetpack.ui.nvgraph.Route
import kotlinx.coroutines.launch
import javax.inject.Inject

class RecipeViewModel @Inject constructor(): ViewModel() {
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
               // _state.value = RecipeViewState.Success(AppModule.provideOctoApi().getData())
            }catch (e:Exception){
            _state.value = RecipeViewState.Error("Error fetching recipe")
            }
        }
    }

    private fun searchRecipe(query:String){
        viewModelScope.launch {
            _state.value = RecipeViewState.Loading
            try {
          /*   _state.value = RecipeViewState.Success(
                // AppModule.provideOctoApi().getData().results
                 _state.value = RecipeViewState.Loading
             )*/
            }catch (e:Exception){
                _state.value = RecipeViewState.Error("")
            }
        }
    }
}

