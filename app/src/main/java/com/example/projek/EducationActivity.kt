package com.example.projek

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class EducationActivity : AppCompatActivity() {

    lateinit var educationView: RecyclerView
    lateinit var educationAdapter: SchoolAdapter
    val list = ArrayList<SchoolData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_education)

        educationView = findViewById(R.id.rvEducation)
        educationView.layoutManager = LinearLayoutManager(this)

        list.add(SchoolData("SD Negeri Sidogemah 1","Dukuh Badong, Ds.Sidogemah, Kec.Sayung, Kab.Demak" ))
        list.add(SchoolData("MTs Nurul Huda ","Dukuh Badong, Ds.Sidogemah, Kec.Sayung, Kab.Demak" ))
        list.add(SchoolData("SMK N 1 Sayung ","Jl.Raya Semarang-Demak Km.14 Onggorawe, Ds.Loireng, Kec.Sayung, Kab.Demak" ))

        educationAdapter = SchoolAdapter(list)
        educationView.adapter = educationAdapter
    }
}