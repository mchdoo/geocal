package com.example.geocalc.navigation

sealed class AppScreens(val route: String) {
    object triangleScreen: AppScreens("triangle_screen")
    object home: AppScreens("home")
}
