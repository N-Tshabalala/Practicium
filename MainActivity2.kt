

package com.example.weather

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        // decl
        val btnClear = findViewById<Button>(R.id.btnClear)
        val btnNext = findViewById<Button>(R.id.btnNext)
        btnNext.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
            val btnBack = findViewById<Button>(R.id.btnBack2)
            btnBack.setOnClickListener {
                val intent1 = Intent(this, MainActivity::class.java)
                startActivity(intent1)

                val days = arrayOf<String>(
                    "Monday",
                    "Tuesday",
                    "Wednesday",
                    "Thursday",
                    "Friday",
                    "Saturday",
                    "Sunday"
                )
                val temp = intArrayOf()

            }
        }


    }
}