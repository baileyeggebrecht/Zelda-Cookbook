package com.example.zeldacookbook.data

import com.example.zeldacookbook.R
import com.example.zeldacookbook.model.Ingredients

class Datasource {
    fun loadIngredients(): List<Ingredients> {
        return listOf<Ingredients>(
            Ingredients(R.string.heartyDurian, R.drawable.heartydurian),
            Ingredients(R.string.apple, R.drawable.apple),
            Ingredients(R.string.heartyRadish, R.drawable.heartyradish),
            Ingredients(R.string.mightyBananas, R.drawable.mightybananas),
            Ingredients(R.string.birdEgg, R.drawable.birdegg),
            Ingredients(R.string.rawMeat, R.drawable.rawmeat),
            Ingredients(R.string.hylianShroom, R.drawable.hylianshroom)
        )
    }
}