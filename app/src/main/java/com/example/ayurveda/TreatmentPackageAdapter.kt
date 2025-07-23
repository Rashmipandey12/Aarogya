package com.example.ayurveda

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TreatmentPackageAdapter(private val packageList: List<TreatmentPackage>) :
    RecyclerView.Adapter<TreatmentPackageAdapter.PackageViewHolder>() {

    inner class PackageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageViewPackage)
        val nameTextView: TextView = itemView.findViewById(R.id.textViewPackageName)
        val descriptionTextView: TextView = itemView.findViewById(R.id.textViewPackageDescription)
        val priceTextView: TextView = itemView.findViewById(R.id.textViewPackagePrice)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PackageViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_treatment_package, parent, false)
        return PackageViewHolder(view)
    }

    override fun onBindViewHolder(holder: PackageViewHolder, position: Int) {
        val treatmentPackage = packageList[position]
        holder.imageView.setImageResource(treatmentPackage.imageResId)
        holder.nameTextView.text = treatmentPackage.name
        holder.descriptionTextView.text = treatmentPackage.description
        holder.priceTextView.text = treatmentPackage.price

        holder.itemView.setOnClickListener {
            val context = holder.itemView.context
            val intent = Intent(context, TreatmentPackageDetailActivity::class.java).apply {
                putExtra("name", treatmentPackage.name)
                putExtra("description", treatmentPackage.description)
                putExtra("price", treatmentPackage.price)
                putExtra("imageResId", treatmentPackage.imageResId)
                putStringArrayListExtra("benefits", ArrayList(treatmentPackage.benefits))
            }
            context.startActivity(intent)
        }
    }


    override fun getItemCount() = packageList.size
}
