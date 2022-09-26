package com.example.zeldacookbook.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
data class Ingredients(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)

class DataSource {

}