package com.example.joobsheet20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.joobsheet20.Kelas

class MainActivity : AppCompatActivity() {
    val list = ArrayList<Kelas>()
    val listNama = arrayOf(
        "SALMA VILINDIA PUTRI",
        "SILVI WIDYA MAULANI",
        "SITI KHOTIJAH",
        "VIVI NUR AISYAH",
        "ZULFA SOFIANA",
        "AHMAD ARDHI SETIAWAN",
        "ANISATUR ROFIQOH",
        "AYU FEBRIANA PUTRI",
        "BOWO SAKTI WIRATAMA",
        "DANUARDI WAHYU P",
        "DEVA BUDIANA"
    )

    val listNis = arrayOf(
        "3029",
        "3031",
        "3033",
        "3035",
        "3039",
        "2973",
        "2974",
        "2977",
        "2979",
        "2981",
        "2982"
    )

    lateinit var kelasView: RecyclerView
    lateinit var kelasAdapter: KelasAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        kelasView = findViewById(R.id.kelasView)
        kelasView.layoutManager = LinearLayoutManager(this)

        for (i in listNama.indices) {
            list.add(Kelas(listNama[i], listNis[i]))
        }

        kelasAdapter = KelasAdapter(list)
        kelasAdapter.notifyDataSetChanged()
        kelasView.adapter = kelasAdapter
    }
}