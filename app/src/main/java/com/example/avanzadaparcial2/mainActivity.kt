package com.example.avanzadaparcial2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ingre = findViewById<Button>(R.id.button)

        ingre.setOnClickListener {
            val calcula = Intent(this@MainActivity, MainActivity2::class.java)
            startActivity(calcula)
        }
    }
}


