package com.compose.jetpack.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun SearchComponent(onSearchClicked: (query: String) -> Unit) {
    val query by remember { mutableStateOf("") }
    val errorMessage by remember { mutableStateOf("") }



}