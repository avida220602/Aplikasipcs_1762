package com.example.aplikasipcs_1762

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //remove title bar
        supportActionBar?.hide()

        //instance button
        val btnHitung: Button = findViewById(R.id.hitung)

        //button start on click event
        btnHitung.setOnClickListener {
            val intent = Intent(this, HitungActivity::class.java)
            startActivity(intent)
        }

        //instance button
        val btnSave: Button = findViewById(R.id.save)

        //button start on click event
        btnSave.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}