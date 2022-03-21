package com.example.recipesapp

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.recipesapp.data.mockRecipes
import com.example.recipesapp.layouts.Home

@Composable
fun MainNavHost(
    navController: NavHostController,
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.name) {
        composable(Screen.Home.name) {
            Home(recipes = mockRecipes)
        }
        composable(Screen.CreateRecipe.name) {

        }
    }
}