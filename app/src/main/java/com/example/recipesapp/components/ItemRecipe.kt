package com.example.recipesapp.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.recipesapp.data.Recipe
import com.example.recipesapp.data.mockRecipe

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun ItemRecipe(
    recipe: Recipe,
) {
    Card(
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier
            .fillMaxWidth(.8f),
        onClick = { /* TODO */ },
        border = BorderStroke(Dp.Hairline, color = MaterialTheme.colors.primary)
    ) {
        Text(
            text = recipe.name,
            style = MaterialTheme.typography.body1,
            modifier = Modifier.padding(8.dp)
            )
    }
}

@Preview
@Composable
fun ItemRecipePreview() {
    ItemRecipe(
        recipe = mockRecipe
    )
}