package com.example.ayurveda

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.SetOptions

class DoctorOtherDetails : AppCompatActivity() {
    private val db = FirebaseFirestore.getInstance()
    private lateinit var fusedLocationClient: FusedLocationProviderClient

    companion object {
        private const val LOCATION_PERMISSION_REQUEST_CODE = 100
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doctor_other_details)

        val addressEditText = findViewById<EditText>(R.id.addressdoc)
        val nameSindocEditText = findViewById<EditText>(R.id.nameSindoc)
        val phonedocEditText = findViewById<EditText>(R.id.phonedoc)
        val latdocEditText = findViewById<EditText>(R.id.latdoc)
        val londocEditText = findViewById<EditText>(R.id.londoc)
        val saveButton = findViewById<Button>(R.id.usersavebtn)

        // Initialize Location Client
        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this)

        // Request Location Permission
        if (checkLocationPermission()) {
            getLastLocation(latdocEditText, londocEditText)
        } else {
            requestLocationPermission()
        }

        val sessionManager = SessionManager(this)
        val userEmail = sessionManager.getUserEmail()

        val categoryDoctorSpinner = findViewById<Spinner>(R.id.doccategory)
        val categories = arrayOf("Sneezing", "Headache", "Cough", "Fever")

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, categories)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        categoryDoctorSpinner.adapter = adapter

        saveButton.setOnClickListener {
            val intent = Intent(this, WelcomeDoctor::class.java)
            startActivity(intent)

            db.collection("doctors")
                .whereEqualTo("email", userEmail)
                .get()
                .addOnSuccessListener { querySnapshot ->
                    if (querySnapshot.isEmpty) {
                        showToast("Doctor with the specified email doesn't exist.")
                    } else {
                        val userDoc = querySnapshot.documents[0]
                        val userId = userDoc.id

                        val address = addressEditText.text.toString()
                        val nameInSinhala = nameSindocEditText.text.toString()
                        val phoneNo = phonedocEditText.text.toString()
                        val latitudeText = latdocEditText.text.toString()
                        val longitudeText = londocEditText.text.toString()
                        val selectedCategory = categoryDoctorSpinner.selectedItem.toString()

                        if (address.isEmpty() || nameInSinhala.isEmpty() || phoneNo.isEmpty()) {
                            showToast("Please fill in all required fields.")
                        } else {
                            val latitude = latitudeText.toDoubleOrNull()
                            val longitude = longitudeText.toDoubleOrNull()

                            if (latitude != null && longitude != null) {
                                val dataToUpdate = mapOf(
                                    "address" to address,
                                    "docNameSn" to nameInSinhala,
                                    "docPhoneNo" to phoneNo,
                                    "latitude" to latitude,
                                    "longitude" to longitude,
                                    "category" to selectedCategory
                                )

                                db.collection("doctors")
                                    .document(userId)
                                    .set(dataToUpdate, SetOptions.merge())
                                    .addOnSuccessListener {
                                        showToast("Data updated successfully.")
                                    }
                                    .addOnFailureListener { e ->
                                        showToast("Failed to update data: ${e.message}")
                                    }
                            } else {
                                showToast("Latitude and longitude must be valid numbers.")
                            }
                        }
                    }
                }
                .addOnFailureListener { e ->
                    showToast("Failed to retrieve user information: ${e.message}")
                }
        }
    }

    private fun checkLocationPermission(): Boolean {
        return ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED
    }

    private fun requestLocationPermission() {
        ActivityCompat.requestPermissions(
            this,
            arrayOf(Manifest.permission.ACCESS_FINE_LOCATION),
            LOCATION_PERMISSION_REQUEST_CODE
        )
    }

    private fun getLastLocation(latEditText: EditText, lonEditText: EditText) {
        fusedLocationClient.lastLocation
            .addOnSuccessListener { location ->
                if (location != null) {
                    latEditText.setText(location.latitude.toString())
                    lonEditText.setText(location.longitude.toString())
                } else {
                    showToast("Unable to get current location.")
                }
            }
            .addOnFailureListener {
                showToast("Failed to retrieve location.")
            }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == LOCATION_PERMISSION_REQUEST_CODE) {
            if ((grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED)) {
                getLastLocation(findViewById(R.id.latdoc), findViewById(R.id.londoc))
            } else {
                showToast("Location permission is required to auto-fill latitude and longitude.")
            }
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
    }
}
