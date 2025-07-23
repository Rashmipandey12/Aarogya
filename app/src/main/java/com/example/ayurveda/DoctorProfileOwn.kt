package com.example.ayurveda

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.result.PickVisualMediaRequest
import androidx.activity.result.contract.ActivityResultContracts
import com.bumptech.glide.Glide
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.google.firebase.storage.FirebaseStorage

class DoctorProfileOwn : AppCompatActivity() {
    // Initialize Firestore
    private val db = FirebaseFirestore.getInstance()
    private val storage = FirebaseStorage.getInstance()
    lateinit var banner: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doctor_profile_own)

        val sessionManager = SessionManager(this)
        val userEmail = sessionManager.getUserEmail()
        banner = findViewById(R.id.imageView28)
        loadBannerFromFirestore()
        banner.setOnClickListener {
            pickMedia.launch(
                PickVisualMediaRequest.Builder()
                    .setMediaType(ActivityResultContracts.PickVisualMedia.ImageOnly)
                    .build()
            )
        }


        val doctorAppoinButton = findViewById<ImageButton>(R.id.userAppointmentsbtn)
        doctorAppoinButton.setOnClickListener {
            val intent = Intent(this, ViewAppoinments::class.java)
            startActivity(intent)
        }

        val doctorRemButton = findViewById<ImageButton>(R.id.remedyNavBtn)
        doctorRemButton.setOnClickListener {
            val intent = Intent(this,AddDoctorRemedy::class.java)
            startActivity(intent)
        }

        // Retrieve the username from the "users" collection
        val usersCollection = db.collection("doctors")
        usersCollection.whereEqualTo("email", userEmail)
            .get()
            .addOnSuccessListener { userQuerySnapshot ->
                if (!userQuerySnapshot.isEmpty) {
                    // There may be multiple documents matching the email; loop through them if needed
                    for (userDocument in userQuerySnapshot.documents) {
                        val username = userDocument.getString("docNameEn")

                        // Now you have the username, and you can use it as needed
                        // For example, you can set it in a TextView
                        val usernameTextView = findViewById<TextView>(R.id.unamenavbar)
                        usernameTextView.text = "Dr. " + (username?.split(" ")?.get(0) ?: "Doctor")

                        // If you found the username you were looking for, you can break out of the loop
                        break
                    }
                } else {
                    // Handle the case when no document with the matching email is found
                    Log.d("Firestore", "No user document found for email: $userEmail")
                }
            }
            .addOnFailureListener { exception ->
                // Handle the failure to retrieve user data
                Log.e("Firestore", "Error getting user document: $exception")
            }

        // Retrieve the doctor's details from the "doctors" collection
        val doctorsCollection = db.collection("doctors")
        doctorsCollection.whereEqualTo("email", userEmail)

            .get()
            .addOnSuccessListener { doctorQuerySnapshot ->
                // Assuming there's only one document with the matching email
                if (!doctorQuerySnapshot.isEmpty) {
                    val doctorDocument = doctorQuerySnapshot.documents[0]
                    val doctorName = doctorDocument.getString("docNameEn")
                    val doctorAddress = doctorDocument.getString("address")
                    val doctorPhoneNo = doctorDocument.getString("docPhoneNo")
                    val doctorQualifications = doctorDocument.getString("docQualification")
                    val doctorRegNo = doctorDocument.getString("docLicense")


                    // Now you have the doctor's details, and you can use them as needed
                    // For example, you can set them in TextView elements

                    val docNamePtxt = findViewById<TextView>(R.id.docNameProf)
                    docNamePtxt.text = doctorName

                    val docAddressTextView = findViewById<TextView>(R.id.docAddr)
                    docAddressTextView.text = doctorAddress

                    val docPhoneNoTextView = findViewById<TextView>(R.id.docPhone)
                    docPhoneNoTextView.text = doctorPhoneNo

                    val docQualificationsTextView = findViewById<TextView>(R.id.docQual)
                    docQualificationsTextView.text = doctorQualifications

                    val docRegNoTextView = findViewById<TextView>(R.id.docRegNo)
                    docRegNoTextView.text = doctorRegNo

                }
            }
            .addOnFailureListener { exception ->
                // Handle the failure to retrieve doctor's data
                Log.e("Firestore", "Error getting doctor document: $exception")
            }

        val logoutButton = findViewById<Button>(R.id.doclogoutbtn)
        logoutButton.setOnClickListener {
            // Logout action
            sessionManager.logout()
            redirectToLoginActivity()
        }
    }

    private fun redirectToLoginActivity() {
        // Create an Intent to navigate to the LoginActivity
        val intent = Intent(this, DoctorLogin::class.java)
        // Clear the back stack so that the user cannot navigate back to DoctorProfileOwn
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(intent)
    }
    // Override the onBackPressed() method to block the back button
    override fun onBackPressed() {
        // Leave this method empty to block the back button
    }

    private val pickMedia =
        registerForActivityResult(ActivityResultContracts.PickVisualMedia()) { uri ->
            if (uri != null) {
                Log.d("PhotoPicker", "Selected URI: $uri")
                banner.setImageURI(uri) // Show image immediately
                uploadImageToFirebase(uri) // Upload to Firebase
            } else {
                Log.d("PhotoPicker", "No media selected")
                Toast.makeText(this, "No image selected", Toast.LENGTH_SHORT).show()
            }
        }


    private fun uploadImageToFirebase(uri: Uri) {
        val storageRef = storage.reference.child("banners/${System.currentTimeMillis()}.jpg")

        storageRef.putFile(uri)
            .addOnSuccessListener { taskSnapshot ->
                // Get the download URL from Firebase Storage
                taskSnapshot.storage.downloadUrl.addOnSuccessListener { downloadUri ->
                    // Save URL to Firebase Database
                    saveImageUrlToFirebase(downloadUri.toString())
                }
            }
            .addOnFailureListener {
                Toast.makeText(this, "Image upload failed: ${it.message}", Toast.LENGTH_SHORT)
                    .show()
            }
    }

    private fun saveImageUrlToFirebase(imageUrl: String) {
        val currentUser = FirebaseAuth.getInstance().currentUser
        if (currentUser != null) {
            val userId = currentUser.uid
            val databaseRef = FirebaseFirestore.getInstance()
                .collection("banner")
                .document("users")
                .collection(userId)
                .document("bannerImages")

            val data = mapOf("imageUrl" to imageUrl)
            databaseRef.set(data)
                .addOnSuccessListener {
                    Toast.makeText(this, "Banner updated successfully", Toast.LENGTH_SHORT)
                        .show()
                }
                .addOnFailureListener {
                    Toast.makeText(this, "Failed to save image URL", Toast.LENGTH_SHORT).show()
                }
        } else {
            Toast.makeText(this, "User not logged in", Toast.LENGTH_SHORT).show()
        }
    }


    private fun loadBannerFromFirestore() {
        val currentUser = FirebaseAuth.getInstance().currentUser
        if (currentUser != null) {
            val userId = currentUser.uid
            val docRef = FirebaseFirestore.getInstance()
                .collection("users")
                .document(userId)
                .collection("banner")
                .document("bannerImage")

            docRef.get()
                .addOnSuccessListener { document ->
                    val imageUrl = document.getString("imageUrl")
                    imageUrl?.let {
                        Glide.with(this).load(it).into(banner)
                    }
                }
                .addOnFailureListener {
                    Toast.makeText(this, "Failed to load banner image", Toast.LENGTH_SHORT)
                        .show()
                }
        } else {
            Toast.makeText(this, "User not logged in", Toast.LENGTH_SHORT).show()
        }
    }
}
