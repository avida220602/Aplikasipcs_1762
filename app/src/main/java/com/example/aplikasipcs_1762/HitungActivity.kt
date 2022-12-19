package com.example.aplikasipcs_1762

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class HitungActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hitung)

        val btnproses = findViewById(R.id.proses) as Button
        val txthasil = findViewById(R.id.hasil) as TextView
        val txtangka1 = findViewById(R.id.angka1) as EditText
        val txtangka2 = findViewById(R.id.angka2) as EditText

        btnproses.setOnClickListener{
            val var1:Int = txtangka1.text.toString().toInt()
            val var2:Int = txtangka2.text.toString().toInt()

            val hasil : Int = var1 + var2
            txthasil.text = hasil.toString()
        }
    }
}