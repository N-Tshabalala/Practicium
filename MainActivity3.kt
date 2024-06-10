package com.example.weather

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        // Declarations

        val days = arrayOf<String>(
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday",
            "Saturday",
            "Sunday"
        )
        val temp = arrayOf<String>(
            "15 to 25 Degrees Celsius",
            "14 to 22 Degrees Celsius",
            "11 to 19 Degrees Celsius",
            "17 to 27 Degrees Celsius",
            "20 to 29 Degrees Celsius",
            "13 to 19 Degrees Celsius",
            "9 to 15 Degrees Celsius"
        )
        val condition = arrayOf<String>(
            "Cloudy",
            "Partly Cloudy",
            "Sunny",
            "Sunny",
            "Light rain",
            "Heavy rain",
            "Partly cloudy"
        )

        val btnBack = findViewById<Button>(R.id.btnBack)
        btnBack.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
            
                 val btnClick = findViewById<Button>(R.id.btnClick)
                     btnClick.setOnClickListener{


                     }
            }


        }
    }

