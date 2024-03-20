package com.compose.jetpack.ui.nvgraph

sealed class Route(val route: String) {
    object MainScreen : Route(route = "main_Screen")
    object DetailScreen : Route(route = "detail_Screen")

}

