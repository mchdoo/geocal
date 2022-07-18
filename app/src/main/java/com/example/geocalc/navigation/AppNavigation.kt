package com.example.geocalc.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.internal.composableLambda
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.geocalc.screens.Home
import com.example.geocalc.screens.TrianguloScreen
import androidx.navigation.NavHost as NavHost1

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreens.home.route) {
        composable(AppScreens.home.route) { Home(navController) }
        composable(AppScreens.triangleScreen.route) { TrianguloScreen(navController) }
    }
}
