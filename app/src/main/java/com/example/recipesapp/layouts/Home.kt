package com.example.recipesapp.layouts

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.recipesapp.components.FloatingActionButton
import com.example.recipesapp.components.Header
import com.example.recipesapp.components.ItemRecipe
import com.example.recipesapp.data.Recipe
import com.example.recipesapp.data.mockRecipes

@Composable
fun Home(
    recipes: List<Recipe>
) {
    Scaffold(
        topBar = { Header(title = "Mis Recetas") },
        floatingActionButton = { FloatingActionButton() },
        floatingActionButtonPosition = FabPosition.Center
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(1f),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.padding(top = 4.dp))
            LazyColumn {
                items(items = recipes) { recipe ->
                    ItemRecipe(
                        recipe = recipe,
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun HomePreview() {
    Home(mockRecipes)
}