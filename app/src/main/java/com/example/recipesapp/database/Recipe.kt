package com.example.recipesapp.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.recipesapp.data.Author
import com.example.recipesapp.data.Ingredient

@Entity(tableName = "recipes_table")
data class Recipe(
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0L,
    @ColumnInfo(name = "recipe_name")
    var name: String = "",
    @ColumnInfo(name = "ingredients")
    var ingredients: List<Ingredient> = listOf(),
    @ColumnInfo(name = "steps")
    var steps: List<String> = listOf(),
    @ColumnInfo(name = "author")
    var author: Author
)
