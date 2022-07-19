package com.example.navigationwithargumentsjatpackcompouse

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun Navigate() {
    val navController = rememberNavController()
    
    NavHost(navController = navController, startDestination = Screen.HomeScreen.route) {
        composable(Screen.HomeScreen.route) {
            HomeScreen(navController)
        }
        composable(
            Screen.DetailScreen.route,
            arguments = listOf(
                navArgument("name") {
                    type = NavType.StringType
                    nullable = true
                },
                navArgument("age") {
                    type = NavType.IntType
                    defaultValue = 0
                }
            )
        ) {
            DetailScreen(
                name = it.arguments?.getString("name"),
                age = it.arguments?.getInt("age").toString())
        }
    }
}