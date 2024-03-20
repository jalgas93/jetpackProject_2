package com.compose.jetpack.ui.nvgraph

import androidx.compose.runtime.Composable

import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.compose.jetpack.ui.screen.DetailScreen
import com.compose.jetpack.ui.screen.MainScreen

@Composable
fun NavGraph(
    startDestination: String
) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Route.MainScreen.route) {

        composable(
            route = Route.MainScreen.route
        ) {
            MainScreen(navController = navController)
        }
        composable(
            route = Route.DetailScreen.route
        ) {
            DetailScreen(navController = navController)
        }

    }

}