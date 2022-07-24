package com.example.recipesapp.layouts

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.recipesapp.components.FloatingActionButton
import com.example.recipesapp.components.ItemRecipe
import com.example.recipesapp.components.RecipesList
import com.example.recipesapp.data.Recipe
import com.example.recipesapp.data.mockRecipes

@Composable
fun Home(
    recipes: List<Recipe>,
    onFabClicked: () -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.TopCenter
    ) {
        Spacer(modifier = Modifier.padding(top = 4.dp))
        RecipesList(recipes)
        FloatingActionButton(
            modifier = Modifier.align(Alignment.BottomCenter),
            onFabClicked = onFabClicked
        )
    }
}

@Preview
@Composable
fun HomePreview() {
    Home(mockRecipes, {})
}