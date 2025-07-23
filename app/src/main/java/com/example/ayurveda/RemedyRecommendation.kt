package com.example.ayurveda

import android.os.Bundle
import android.widget.SearchView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.InputStreamReader

class RemedyRecommendation : AppCompatActivity() {

    private lateinit var remedyAdapter: RemedyAdapter
    private lateinit var searchView: SearchView
    private lateinit var allData: List<RemedyData>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_remedy_recommendation)

        val recyclerView = findViewById<RecyclerView>(R.id.recycleviewremedies)
        recyclerView.layoutManager = LinearLayoutManager(this)
        remedyAdapter = RemedyAdapter(emptyList())
        recyclerView.adapter = remedyAdapter

        searchView = findViewById(R.id.searchView)

        allData = loadRemedyDataFromAssets()
        setupSearch()
    }

    private fun loadRemedyDataFromAssets(): List<RemedyData> {
        val inputStream = assets.open("remedies.json")
        val reader = InputStreamReader(inputStream)
        val type = object : TypeToken<List<RemedyData>>() {}.type
        return Gson().fromJson(reader, type)
    }

    private fun setupSearch() {
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                filterRemedies(query ?: "")
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                filterRemedies(newText ?: "")
                return true
            }
        })
    }

    private fun filterRemedies(condition: String) {
        val remedies = allData.find {
            it.condition.equals(condition.trim(), ignoreCase = true)
        }?.remedies

        if (remedies != null && remedies.isNotEmpty()) {
            remedyAdapter.updateList(remedies)
        } else {
            remedyAdapter.updateList(emptyList())
            Toast.makeText(this, "No remedies found for \"$condition\"", Toast.LENGTH_SHORT).show()
        }
    }
}
