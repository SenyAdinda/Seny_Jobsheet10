package com.example.seny_jobsheett10

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextName = findViewById<EditText>(R.id.editTextName)
        val editTextClass = findViewById<EditText>(R.id.editTextClass)
        val editTextNIS = findViewById<EditText>(R.id.editTextNIS)
        val buttonSubmit = findViewById<Button>(R.id.buttonSubmit)

        buttonSubmit.setOnClickListener {
            val name = editTextName.text.toString()
            val className = editTextClass.text.toString()
            val nis = editTextNIS.text.toString()

            val intent = Intent(this, SecondActivity::class.java).apply {
                putExtra("EXTRA_NAME", name)
                putExtra("EXTRA_CLASS", className)
                putExtra("EXTRA_NIS", nis)
            }
            startActivity(intent)
        }
    }
}
