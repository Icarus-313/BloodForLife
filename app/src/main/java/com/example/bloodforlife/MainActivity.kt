package com.example.bloodforlife

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize views
        val btnDonate = findViewById<Button>(R.id.btnDonate)
        val tvMessage = findViewById<TextView>(R.id.tvMessage)

        // Set up button click listener
        btnDonate.setOnClickListener {
            tvMessage.text = "Thank you for donating blood!"
        }
    }

}