package com.example.segundoparcial_19475

import androidx.annotation.DrawableRes

data class Personas(
    @DrawableRes val img: Int,
    val profesion: String,
    val genero: String,
    val edad: Int
)