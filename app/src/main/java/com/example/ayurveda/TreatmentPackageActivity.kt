package com.example.ayurveda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class TreatmentPackageActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: TreatmentPackageAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_treatment_package)

        recyclerView = findViewById(R.id.recyclerViewTreatmentPackages)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val treatmentPackages = listOf(
            TreatmentPackage(
                "Detoxification Package",
                "Removes toxins from the body.",
                "₹2,500",
                R.drawable.detoxification_image,
                listOf(
                    "Flushes out harmful toxins",
                    "Improves liver and kidney function",
                    "Enhances energy and vitality",
                    "Supports clearer skin",
                    "Boosts mental clarity"
                )
            ),
            TreatmentPackage(
                "Rejuvenation Therapy",
                "Refreshes and revitalizes your body.",
                "₹3,000",
                R.drawable.rejuvenation_image,
                listOf(
                    "Slows aging process",
                    "Improves skin texture and glow",
                    "Enhances immunity and stamina",
                    "Restores mental balance",
                    "Reduces fatigue and stress"
                )
            ),
            TreatmentPackage(
                "Panchakarma Treatment",
                "Deep healing with five actions.",
                "₹5,500",
                R.drawable.panchakarma_image,
                listOf(
                    "Cleanses deep-seated toxins",
                    "Balances doshas (Vata, Pitta, Kapha)",
                    "Improves digestion and metabolism",
                    "Boosts immunity",
                    "Enhances mental clarity and calmness"
                )
            ),
            TreatmentPackage(
                "Stress Relief Program",
                "Reduces mental stress and anxiety.",
                "₹2,800",
                R.drawable.stress_relief_image,
                listOf(
                    "Promotes relaxation and calmness",
                    "Improves sleep quality",
                    "Reduces anxiety and tension",
                    "Balances hormones naturally",
                    "Increases focus and mental clarity"
                )
            ),
            TreatmentPackage(
                "Weight Loss Package",
                "Ayurvedic weight loss treatments.",
                "₹4,000",
                R.drawable.weight_loss_image,
                listOf(
                    "Reduces excess fat naturally",
                    "Boosts metabolism",
                    "Improves digestion and gut health",
                    "Promotes healthy lifestyle habits",
                    "Tones and strengthens muscles"
                )
            ),
            TreatmentPackage(
                "Immunity Booster Therapy",
                "Strengthens immunity naturally.",
                "₹3,200",
                R.drawable.immunity_booster_image,
                listOf(
                    "Increases resistance to infections",
                    "Improves energy levels",
                    "Balances immune responses",
                    "Supports respiratory health",
                    "Reduces frequency of illnesses"
                )
            ),
            TreatmentPackage(
                "Skin Care Treatment",
                "Glowing skin with ayurvedic methods.",
                "₹2,600",
                R.drawable.skin_care_image,
                listOf(
                    "Clears acne and blemishes",
                    "Improves skin tone and texture",
                    "Delays signs of aging",
                    "Hydrates and nourishes skin",
                    "Balances skin's natural oils"
                )
            ),
            TreatmentPackage(
                "Joint Pain Relief Package",
                "Relieves arthritis and joint pain.",
                "₹3,800",
                R.drawable.joint_pain_image,
                listOf(
                    "Reduces inflammation and stiffness",
                    "Improves joint mobility",
                    "Soothes chronic pain",
                    "Strengthens muscles and ligaments",
                    "Supports bone health"
                )
            )
        )

        adapter = TreatmentPackageAdapter(treatmentPackages)
        recyclerView.adapter = adapter
    }
}
