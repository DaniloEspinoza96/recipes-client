package com.example.recipesapp.components

import android.graphics.drawable.shapes.Shape
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.recipesapp.data.Recipe
import com.example.recipesapp.data.mockRecipe

@Composable
fun ItemRecipe(
    recipe: Recipe,
) {
    Surface(
        modifier = Modifier
            .clickable { /* TODO */ }
            .fillMaxWidth(.8f)
    ) {
        Text(
            text = recipe.name,
            style = MaterialTheme.typography.body1,
            modifier = Modifier
                .padding(vertical = 2.dp)
                .border(
                    width = Dp.Hairline,
                    color = MaterialTheme.colors.primary,
                    shape = RoundedCornerShape(8.dp)
                )
                .padding(all = 8.dp)
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