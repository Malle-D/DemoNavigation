package com.example.demonavigation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.demonavigation.screen.Screen
import com.example.demonavigation.screen.screens.AuthScreen
import com.example.demonavigation.screen.screens.MainScreen
import com.example.demonavigation.screen.screens.ProfileScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.AuthScreen.route) {
        composable(route = Screen.AuthScreen.route) {
            AuthScreen(navController = navController)
        }
        composable(
            route = Screen.ProfileScreen.route + "/{phone}",
            arguments = listOf(
                navArgument("phone") {
                    type = NavType.StringType
                }
            )
        ) { entry ->
            ProfileScreen(
                navController = navController,
                phone = entry.arguments?.getString("phone")
            )
        }
        composable(
            route = Screen.MainScreen.route + "/{phone}/{name}",
            arguments = listOf(
                navArgument("phone") {
                    type = NavType.StringType
                },
                navArgument("name") {
                    type = NavType.StringType
                }
            )
        ) { entry ->
            MainScreen(
                phone = entry.arguments?.getString("phone"),
                name = entry.arguments?.getString("name"),
            )
        }
    }
}

