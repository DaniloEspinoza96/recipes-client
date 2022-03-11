package com.example.recipesapp.data

val mockRecipe = Recipe(
    name = "Pan con queso",
    ingredients = listOf(
        Ingredient(
            name = "Pan",
            quantity = 1.0
        ),
        Ingredient(
            name = "Queso",
            quantity = 1.0,
            unit = "Lamina"
        ),
    ),
    steps = listOf(
        "Cortar el pan horizontalmente",
        "(Opcional) Tostar el pan",
        "Poner el queso",
        "Cerrar el pan",
    ),
    author = Author(
        nickname = "Danilo96"
    )
)

val mockRecipes = listOf(mockRecipe, mockRecipe, mockRecipe)