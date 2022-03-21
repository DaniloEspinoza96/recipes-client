package com.example.recipesapp.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.recipesapp.data.Recipe

@Composable
fun RecipesList(recipes: List<Recipe>) {
    LazyColumn {
        items(items = recipes) { recipe ->
            ItemRecipe(
                recipe = recipe,
            )
        }
    }
}