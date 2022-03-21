package com.example.recipesapp

enum class Screen(
    val title: String = ""
) {
    Home(
        title = "Mis Recetas"
    ),
    CreateRecipe(
        title = "Agregar Receta"
    );

    companion object {
        fun fromRoute(route: String?): Screen =
            when (route?.substringBefore("/")) {
                Home.name -> Home
                CreateRecipe.name -> CreateRecipe
                null -> Home
                else -> throw IllegalArgumentException("Route $route is not a valid destination")
            }
    }
}