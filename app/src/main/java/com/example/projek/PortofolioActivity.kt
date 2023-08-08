package com.example.projek

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class PortofolioActivity : AppCompatActivity() {
    lateinit var PortofolioView: RecyclerView
    lateinit var PortofolioAdapter: PortofolioAdapter
    val listPortofolio = ArrayList<PortofolioData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_portofolio2)

        listPortofolio.add(PortofolioData(
            R.drawable.web, "tugas-Codeigniter4",
            "Projek Codeigniter4", "https://github.com/Nurizza321/tugas-Codeigniter4"
        ))

        listPortofolio.add(PortofolioData(
            R.drawable.android, "ProjekProfilGuru",
            "Projek Profil Guru", "https://github.com/Nurizza321/ProjekProfilGuru"
        ))

        PortofolioView = findViewById(R.id.rvPortofolio)
        PortofolioView.layoutManager = LinearLayoutManager(this)

        PortofolioAdapter = PortofolioAdapter(listPortofolio)
        PortofolioAdapter.notifyDataSetChanged()
        PortofolioView.adapter = PortofolioAdapter

    }
}