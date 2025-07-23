package com.example.ayurveda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class TreatmentPackageDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_treatment_package_detail)

        val imageView: ImageView = findViewById(R.id.detailImageView)
        val nameTextView: TextView = findViewById(R.id.detailNameTextView)
        val descriptionTextView: TextView = findViewById(R.id.detailDescriptionTextView)
        val priceTextView: TextView = findViewById(R.id.detailPriceTextView)
        val benefitsTextView: TextView = findViewById(R.id.detailBenefitsTextView)

        val name = intent.getStringExtra("name")
        val description = intent.getStringExtra("description")
        val price = intent.getStringExtra("price")
        val imageResId = intent.getIntExtra("imageResId", 0)
        val benefits = intent.getStringArrayListExtra("benefits") ?: listOf()


        nameTextView.text = name
        descriptionTextView.text = description
        priceTextView.text = price
        imageView.setImageResource(imageResId)
        benefitsTextView.text = benefits.joinToString(separator = "\n• ", prefix = "• ")
    }
}
