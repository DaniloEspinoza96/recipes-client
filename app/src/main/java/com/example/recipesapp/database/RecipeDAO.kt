package com.example.recipesapp.database

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface RecipeDAO {
    @Insert
    fun insert(recipe: Recipe)
    @Update
    fun update(recipe: Recipe)
    @Query("SELECT * FROM recipes_table ORDER BY id DESC")
    fun getAllRecipes(): LiveData<List<Recipe>> // no sé si puedo utilizar MutableState de compose
    @Query("SELECT * FROM recipes_table WHERE id= :key")
    fun get(key: Long): Recipe
    @Delete
    fun delete(recipe: Recipe)
}