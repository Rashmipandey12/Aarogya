package com.example.ayurveda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ExerciseActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: ExerciseAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val exercises = listOf(
            Exercise("Yoga Asanas For Diabetes",
                    "• Surya Namaskar\n" +

                            "How: A flow of 12 dynamic poses with breath.\n" +

                            "Benefit: Improves insulin sensitivity and circulation.\n" +
                            "\n" +
                            "• Viparita Karani\n" +

                            "How: Lie with legs up against a wall.\n" +

                            "Benefit: Reduces stress and balances hormones.\n" +
                         "\n"+
                            "• Bhujangasana\n" +

                            "How: Lie on your stomach, lift your chest.\n" +

                            "Benefit: Stimulates digestion and improves pancreatic function.\n" +
                            "\n"+
                            "• Matsyendrasana\n" +

                            "How: Sit, twist torso over a bent leg.\n" +

                            "Benefit: Stimulates liver and pancreas, enhances insulin production.",   imageResId = R.drawable.yoga,
                videoUrl = "https://firebasestorage.googleapis.com/v0/b/aarogya-a8988.firebasestorage.app/o/YOGA%20FOR%20DIABITIES.mp4?alt=media&token=7ff11a31-44e7-4733-ae01-8c0df991469c"
            ),

            Exercise("Yoga Asanas For Liver", "• Ardha Matsyendrasana\n" +
                    "How: Sit, twist torso over bent knee.\n" +
                    "Benefit: Stimulates liver, aids digestion.\n" +
                    "\n" +
                    "• Dhanurasana\n" +
                    "How: Lie on stomach, lift chest and legs.\n" +
                    "Benefit: Strengthens liver, boosts blood flow.\n" +
                    "\n" +
                    "• Bhujangasana\n" +
                    "How: Lie flat, lift upper body with palms.\n" +
                    "Benefit: Stimulates liver, reduces stress.\n" +
                    "\n" +
                    "• Paschimottanasana\n" +
                    "How: Sit, bend forward to touch feet.\n" +
                    "Benefit: Enhances liver function, aids digestion.\n" +
                    "\n" +
                    "• Kapalbhati Pranayama\n" +
                    "How: Sit, exhale forcefully through nose.\n" +
                    "Benefit: Detoxifies liver, boosts metabolism", R.drawable.yoga2,
                videoUrl = "https://firebasestorage.googleapis.com/v0/b/aarogya-a8988.firebasestorage.app/o/YOGA%20FOR%20LIVER.mp4?alt=media&token=e4834a2d-f70c-42c0-9461-d646241d0e69"
            ),

            Exercise("Yoga Asanas For Asthma", "• Surya Namaskar (Sun Salutation)\n" +
                    "How: Perform a sequence of 12 yoga poses with breath.\n" +
                    "Benefit: Boosts liver function and detoxifies the body.\n" +
                    "\n" +
                    "• Kapalabhati Pranayama\n" +
                    "How: Forceful exhale through nose with abdominal movement.\n" +
                    "Benefit: Cleanses liver and improves metabolism.\n" +
                    "\n" +
                    "• Dhanurasana (Bow Pose)\n" +
                    "How: Lie on stomach, lift chest and legs while holding ankles.\n" +
                    "Benefit: Stimulates liver and strengthens digestion.\n" +
                    "\n" +
                    "• Ardha Matsyendrasana (Half Lord of the Fishes)\n" +
                    "How: Sit, twist torso with one leg bent over the other.\n" +
                    "Benefit: Aids liver detox and digestion.\n" +
                    "\n" +
                    "• Setu Bandhasana (Bridge Pose)\n" +
                    "How: Lie on back, lift hips while pressing feet and arms.\n" +
                    "Benefit: Activates liver and improves circulation.\n" +
                    "\n" +
                    "• Ardha Pavanamuktasana (Half Wind-Relieving Pose)\n" +
                    "How: Lie down, hug one knee to chest.\n" +
                    "Benefit: Relieves gas and massages liver.", R.drawable.yoga3,
                videoUrl = "https://firebasestorage.googleapis.com/v0/b/aarogya-a8988.firebasestorage.app/o/YOGA%20FOR%20ASTHAMA.mp4?alt=media&token=cdece8e1-8629-41fb-961f-5f8b50bcd5c2"
            ),
        )

        adapter = ExerciseAdapter(exercises)
        recyclerView.adapter = adapter
    }
}
