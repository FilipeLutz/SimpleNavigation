package com.example.simplenavigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    var word by remember { mutableStateOf("") }

    NavHost(navController = navController, startDestination = "screen1") {
        composable("screen1") {
            Screen1(navController, onWordEntered = { newWord -> word = newWord })
        }
        composable("screen2") {
            Screen2(navController, word)
        }
        composable("screen3") {
            Screen3(navController, word)
        }
    }
}