package com.example.ayurveda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageButton
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.firestore.FirebaseFirestore

import android.widget.SearchView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager

class HerbRecommendation : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var herbAdapter: HerbAdapter
    private lateinit var herbArrayList: ArrayList<Herb>

    private lateinit var db: FirebaseFirestore

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_herb_recommendation)

        // Back to DoctorRecommendation
        val backButton = findViewById<ImageButton>(R.id.backbtn)
        backButton.setOnClickListener {
            val intent = Intent(this, DoctorRecommendation::class.java)
            startActivity(intent)
        }

        // Profile
        db = FirebaseFirestore.getInstance()
        val sessionManager = SessionManager(this)
        val userEmail = sessionManager.getUserEmail()

        val userNavButton = findViewById<ImageButton>(R.id.userProfileNavbtn)
        userNavButton.setOnClickListener {
            val intent = Intent(this, UserProfile::class.java)
            startActivity(intent)
        }

        val usersCollection = db.collection("users")
        usersCollection.whereEqualTo("email", userEmail)
            .get()
            .addOnSuccessListener { userQuerySnapshot ->
                if (!userQuerySnapshot.isEmpty) {
                    for (userDocument in userQuerySnapshot.documents) {
                        val username = userDocument.getString("username")
                        val usernameTextView = findViewById<TextView>(R.id.unamenavbar)
                        usernameTextView.text = username?.split(" ")?.get(0) ?: "User"
                        break
                    }
                } else {
                    Log.d("Firestore", "No user document found for email: $userEmail")
                }
            }
            .addOnFailureListener { exception ->
                Log.e("Firestore", "Error getting user document: $exception")
            }

        // Doctor
        val doctorsBtn = findViewById<Button>(R.id.doctorsbtn)
        doctorsBtn.setOnClickListener {
            val intent = Intent(this, DoctorRecommendation::class.java)
            startActivity(intent)
        }

        // Herb
        val herbsBtn = findViewById<Button>(R.id.herbsbtn)
        herbsBtn.setOnClickListener {
            val intent = Intent(this, HerbRecommendation::class.java)
            startActivity(intent)
        }

        // Appointments
        val appBtn = findViewById<ImageButton>(R.id.userAppointmentsbtn)
        appBtn.setOnClickListener {
            val intent = Intent(this, UserAppointments::class.java)
            startActivity(intent)
        }

        // Store
        val storeBtn = findViewById<ImageButton>(R.id.storenavbtn)
        storeBtn.setOnClickListener {
            val intent = Intent(this, StoreHome::class.java)
            startActivity(intent)
        }

        // Home
        val homeBtn = findViewById<ImageButton>(R.id.homenavbtn_1)
        homeBtn.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

        recyclerView = findViewById(R.id.store_recyclerview)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        herbArrayList = ArrayList()
        herbAdapter = HerbAdapter(herbArrayList)
        recyclerView.adapter = herbAdapter

        // Setup search functionality
        val searchView = findViewById<SearchView>(R.id.herbSearch)
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                performSearch(query)
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                performSearch(newText)
                return true
            }
        })

        loadHerbs()
    }

    private fun loadHerbs() {
        db.collection("herbs").get()
            .addOnSuccessListener { result ->
                for (document in result) {
                    val category = document.getString("category") ?: ""
                    val description = document.getString("description") ?: ""
                    val title = document.getString("title") ?: ""
                    val image = document.getString("image") ?: ""

                    val herb = Herb(category, description, title, image)
                    herbArrayList.add(herb)
                }
                herbAdapter.notifyDataSetChanged()
            }
            .addOnFailureListener { exception ->
                Toast.makeText(this, exception.toString(), Toast.LENGTH_SHORT).show()
            }
    }

    private fun performSearch(query: String?) {
        val filteredHerbs = if (query.isNullOrBlank()) {
            // If the query is empty or null, show all herbs
            herbArrayList
        } else {
            // Filter herbs based on the title or category
            herbArrayList.filter { herb ->
                herb.title.contains(query, ignoreCase = true) ||
                        herb.category.contains(query, ignoreCase = true)
            }
        }

        // Update the RecyclerView with the filtered data
        herbAdapter.updateData(filteredHerbs)
    }
}