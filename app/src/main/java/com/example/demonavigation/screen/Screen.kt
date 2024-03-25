package com.example.demonavigation.screen

sealed class Screen(val route: String) {
    data object AuthScreen : Screen("auth_screen")
    data object ProfileScreen : Screen("profile_screen")
    data object MainScreen : Screen("main_screen")

    fun withArgs(vararg args : String) : String {

        return buildString {
            append(route)
            args.forEach { args ->
                append("/$args")
            }
        }

    }

}