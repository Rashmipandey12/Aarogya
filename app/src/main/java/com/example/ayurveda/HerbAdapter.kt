package com.example.ayurveda

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class HerbAdapter(private var herbsList: List<Herb>) :
    RecyclerView.Adapter<HerbAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item_herb_products, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val herb = herbsList[position]

        // Bind data to the views
        holder.herbTitle.text = herb.title
        Picasso.get()
            .load(herb.image)
            .placeholder(R.drawable.ayurveda)
            .error(R.drawable.herb)
            .into(holder.herbImg)

        holder.profileBtn.setOnClickListener {
            val context = holder.itemView.context
            val intent = Intent(context, Remedies::class.java)

            intent.putExtra("description", herb.description)
            intent.putExtra("title", herb.title)

            context.startActivity(intent)
        }
    }

    fun updateData(newData: List<Herb>) {
        herbsList = newData
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return herbsList.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val herbTitle: TextView = itemView.findViewById(R.id.remedyTitle)
        val profileBtn: ImageButton = itemView.findViewById(R.id.goRemedyProfile)
        val herbImg: ImageView = itemView.findViewById(R.id.avatarP)
    }
}
