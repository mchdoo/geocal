package com.example.geocalc.navigation

sealed class AppScreens(val route: String) {
    object CuadradoScreen: AppScreens("cuadrado_screen")
    object Home: AppScreens("home")
}
