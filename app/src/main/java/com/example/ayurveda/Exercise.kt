package com.example.ayurveda

data class Exercise(
    val title: String,
    val description: String,
    val imageResId: Int,
    val videoResId: Int? = null,
    val videoUrl: String? = null
)
