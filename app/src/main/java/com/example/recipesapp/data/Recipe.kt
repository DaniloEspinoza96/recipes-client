package com.example.recipesapp.data

import java.util.*

data class Recipe(
    val id: UUID = UUID.randomUUID(),
    var name: String = "",
    val ingredients: List<Ingredient>?,
    val steps: List<String>?,
    val author: Author
)
