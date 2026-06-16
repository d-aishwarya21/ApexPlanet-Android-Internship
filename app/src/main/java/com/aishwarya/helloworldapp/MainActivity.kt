package com.aishwarya.helloworldapp

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btnClick)
        btn.setOnClickListener {
            Toast.makeText(this, "Hello Hritvik! 🚀", Toast.LENGTH_SHORT).show()
        }
    }
}