package com.example.ayurveda

import android.Manifest
import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.PackageManager
import android.location.Location
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.firebase.firestore.FirebaseFirestore

class DoctorRegister : AppCompatActivity() {

    private val db = FirebaseFirestore.getInstance()
    private lateinit var fusedLocationClient: FusedLocationProviderClient
    private var latitude: Double? = null
    private var longitude: Double? = null

    companion object {
        private const val LOCATION_PERMISSION_REQUEST_CODE = 1001
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doctor_register)

        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this)
        getLastLocation()

        val signInButton = findViewById<ImageButton>(R.id.docsigninbtn)
        signInButton.setOnClickListener {
            startActivity(Intent(this, DoctorLogin::class.java))
        }

        val UsersignUpButton = findViewById<ImageButton>(R.id.userregbtnback)
        UsersignUpButton.setOnClickListener {
            startActivity(Intent(this, UsersRegister::class.java))
        }

        val unameEditText = findViewById<EditText>(R.id.uname)
        val slmcregEditText = findViewById<EditText>(R.id.slmcreg)
        val specializationEditText = findViewById<EditText>(R.id.specialization)
        val upasswordEditText = findViewById<EditText>(R.id.upassword)
        val uemailEditText = findViewById<EditText>(R.id.uemail)
        val registerButton = findViewById<Button>(R.id.userregisterbtn)

        registerButton.setOnClickListener {
            val docNameEn = unameEditText.text.toString()
            val password = upasswordEditText.text.toString()
            val docLicense = slmcregEditText.text.toString()
            val docQualification = specializationEditText.text.toString()
            val email = uemailEditText.text.toString()

            if (latitude == null || longitude == null) {
                showToast("Fetching location... Please try again in a few seconds.")
                return@setOnClickListener
            }

            db.collection("doctors")
                .whereEqualTo("email", email)
                .get()
                .addOnCompleteListener { task ->
                    if (task.isSuccessful) {
                        if (task.result != null && !task.result!!.isEmpty) {
                            showToast("Email already in use. Please choose a different email.")
                        } else {
                            val userData = hashMapOf(
                                "docNameEn" to docNameEn,
                                "email" to email,
                                "docLicense" to docLicense,
                                "docQualification" to docQualification,
                                "password" to password,
                                "latitude" to latitude,
                                "longitude" to longitude,
                                "address" to null,
                                "avatarUrl" to "null",
                                "docNameSn" to null,
                                "docPhoneNo" to null,
                                "category" to null
                            )

                            db.collection("doctors")
                                .add(userData)
                                .addOnSuccessListener { documentReference ->
                                    showToast("Registration successful!")
                                    startActivity(Intent(this, DoctorOtherDetails::class.java))
                                    val sessionManager = SessionManager(this)
                                    sessionManager.saveUserSession(email)
                                }
                                .addOnFailureListener { e ->
                                    Log.w("Firestore", "Error adding document", e)
                                }
                        }
                    } else {
                        Log.e("Firestore", "Error checking for duplicate email", task.exception)
                    }
                }
        }
    }

    private fun getLastLocation() {
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED &&
            ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION),
                LOCATION_PERMISSION_REQUEST_CODE
            )
            return
        }

        fusedLocationClient.lastLocation.addOnSuccessListener { location: Location? ->
            if (location != null) {
                latitude = location.latitude
                longitude = location.longitude
                Log.d("Location", "Latitude: $latitude, Longitude: $longitude")
            } else {
                showToast("Unable to get location. Make sure location is enabled.")
            }
        }.addOnFailureListener {
            showToast("Failed to get location: ${it.message}")
        }
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == LOCATION_PERMISSION_REQUEST_CODE && grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            getLastLocation()
        } else {
            showToast("Location permission denied. Enable it from settings to auto-fill location.")
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
