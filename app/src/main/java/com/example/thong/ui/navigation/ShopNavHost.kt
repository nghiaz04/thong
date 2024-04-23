package com.example.thong.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.thong.ui.home.HomeScreen
import com.example.thong.ui.home.HomeScreenDestination
import com.example.thong.ui.login.SignInDestination
import com.example.thong.ui.login.SignInScreen
import com.example.thong.ui.login.SignUpDestination
import com.example.thong.ui.login.SignUpScreen

@Composable
fun ShopNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = SignInDestination.route,
        modifier = modifier
    ) {
        composable(route = SignInDestination.route) {
            SignInScreen(
                navigateToSignUp = {
                    navController.navigate(SignUpDestination.route)
                },
                navigateToHome = {
                    navController.navigate(HomeScreenDestination.route)
                }
            )
        }

        composable(route = SignUpDestination.route) {
            SignUpScreen(navigateToSignIn = {
                navController.navigate(SignInDestination.route)
            })
        }
        composable(route = HomeScreenDestination.route) {
            HomeScreen()
        }
    }
}