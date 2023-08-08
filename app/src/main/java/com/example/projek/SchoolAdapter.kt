package com.example.projek

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SchoolAdapter (private val list: ArrayList<SchoolData>):
    RecyclerView.Adapter<SchoolAdapter.schoolViewHolder>(){

    class schoolViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        private val nama = itemView.findViewById<TextView>(R.id.namaSekolah)
        private val alamat = itemView.findViewById<TextView>(R.id.alamatSekolah)

        fun bind(get: SchoolData) {
            nama.text = get.nama
            alamat.text = get.alamat
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): schoolViewHolder {
        return schoolViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.school_list, parent, false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: schoolViewHolder, position: Int) {
        holder.bind(list[position])
    }
}