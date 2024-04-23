package com.example.thong

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.thong.ui.navigation.ShopNavHost

@Composable
fun ShopApp() {
    ShopNavHost(navController = rememberNavController())
}