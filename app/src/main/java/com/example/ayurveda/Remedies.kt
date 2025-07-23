package com.example.ayurveda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageButton
import android.widget.TextView
import com.google.firebase.firestore.FirebaseFirestore

class Remedies : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_remedies)

        val description = intent.getStringExtra("description") ?: "Description not available"
        val title = intent.getStringExtra("title") ?: "No Title"

        val subTitleTextView = findViewById<TextView>(R.id.remedySubTitle)
        val descriptionTextView = findViewById<TextView>(R.id.remedydescpage)
        val titleTextView = findViewById<TextView>(R.id.remedyTitle)

        subTitleTextView.text = title
        descriptionTextView.text = description
        titleTextView.text = title

        // User navbar setup, if needed:
        val sessionManager = SessionManager(this)
        val userEmail = sessionManager.getUserEmail()
        val userNavButton = findViewById<ImageButton>(R.id.userProfileNavbtn)
        userNavButton.setOnClickListener {
            startActivity(Intent(this, UserProfile::class.java))
        }

        val db = FirebaseFirestore.getInstance()
        db.collection("users")
            .whereEqualTo("email", userEmail)
            .get()
            .addOnSuccessListener { snapshot ->
                if (!snapshot.isEmpty) {
                    val username = snapshot.documents[0].getString("username") ?: "User"
                    val usernameTextView = findViewById<TextView>(R.id.unamenavbar)
                    usernameTextView.text = username.split(" ")[0]
                }
            }
    }
}
