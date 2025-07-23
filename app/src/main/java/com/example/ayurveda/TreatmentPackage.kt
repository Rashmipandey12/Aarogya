package com.example.ayurveda

data class TreatmentPackage(
    val name: String,
    val description: String,
    val price: String,
    val imageResId: Int, // This will store the image resource (e.g., R.drawable.someimage)
    val benefits: List<String>
)
