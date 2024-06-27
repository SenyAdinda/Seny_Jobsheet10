package com.example.seny_jobsheett10

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val textViewName = findViewById<TextView>(R.id.textViewName)
        val textViewClass = findViewById<TextView>(R.id.textViewClass)
        val textViewNIS = findViewById<TextView>(R.id.textViewNIS)

        val name = intent.getStringExtra("EXTRA_NAME")
        val className = intent.getStringExtra("EXTRA_CLASS")
        val nis = intent.getStringExtra("EXTRA_NIS")

        textViewName.text = "Nama: $name"
        textViewClass.text = "Kelas: $className"
        textViewNIS.text = "NIS: $nis"
    }
}