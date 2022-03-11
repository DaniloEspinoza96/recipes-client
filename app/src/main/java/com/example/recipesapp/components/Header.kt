package com.example.recipesapp.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Arrangement.Center
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.primarySurface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.intellij.lang.annotations.JdkConstants

@Composable
fun Header(title: String) {
    Surface(
        color = MaterialTheme.colors.primarySurface,
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(1f)
                .padding(vertical = 8.dp),
            horizontalArrangement = Center
        ) {
            Text(
                text = title,
                style = MaterialTheme.typography.h5
            )
        }
    }
}

@Preview
@Composable
fun HeaderPreview() {
    Header(title = "Mis Recetas")
}