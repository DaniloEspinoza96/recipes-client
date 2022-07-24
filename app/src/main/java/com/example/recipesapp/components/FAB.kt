package com.example.recipesapp.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun FloatingActionButton(
    modifier: Modifier,
    onFabClicked: () -> Unit
) {
    Button(
        onClick = onFabClicked,
        shape = CircleShape,
        modifier = modifier
            .padding(24.dp)
            .size(50.dp),
        contentPadding = PaddingValues(0.dp)
    ) {
        Icon(
            imageVector = Icons.Default.Add,
            contentDescription = "Añadir receta"
        )
    }
}