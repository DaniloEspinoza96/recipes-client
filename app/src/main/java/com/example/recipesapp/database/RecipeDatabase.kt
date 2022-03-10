package com.example.recipesapp.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Recipe::class], version = 1, exportSchema = false)
abstract class RecipeDatabase: RoomDatabase() {
    abstract val recipeDAO: RecipeDAO
    companion object {
        @Volatile
        private var INSTANCE: RecipeDatabase? = null
        fun getInstance(context: Context): RecipeDatabase {
            var instance = INSTANCE
            if(instance == null) {
                instance = Room
                    .databaseBuilder(
                        context,
                        RecipeDatabase::class.java,
                        "local_recipes_database"
                    )
                    .fallbackToDestructiveMigration()
                    .build()
            }
            return instance
        }
    }
}