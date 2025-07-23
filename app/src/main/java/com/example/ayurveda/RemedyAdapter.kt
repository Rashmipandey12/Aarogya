package com.example.ayurveda

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RemedyAdapter(private var remedies: List<RemedyItem>) :
    RecyclerView.Adapter<RemedyAdapter.RemedyViewHolder>() {

    class RemedyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val remedyText: TextView = itemView.findViewById(R.id.remedy_text)
        val remedyDesc: TextView = itemView.findViewById(R.id.remedy_description)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RemedyViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item_remedies, parent, false)
        return RemedyViewHolder(view)
    }

    override fun onBindViewHolder(holder: RemedyViewHolder, position: Int) {
        val item = remedies[position]
        holder.remedyText.text = item.remedy
        holder.remedyDesc.text = item.description

        holder.itemView.setOnClickListener {
            val context = holder.itemView.context
            val intent = Intent(context, Remedies::class.java).apply {
                putExtra("title", item.remedy)
                putExtra("description", item.description)
            }
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int = remedies.size

    fun updateList(newList: List<RemedyItem>) {
        remedies = newList
        notifyDataSetChanged()
    }
}
