package com.example.screens

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var refinescr:Button
    private lateinit var explorescr:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        refinescr = findViewById(R.id.refinescreen)
        explorescr = findViewById(R.id.explorescreen)

        refinescr.setOnClickListener{
            val intent = Intent(this,Refinescreen::class.java)
            startActivity(intent)
        }
        explorescr.setOnClickListener{
            val intent = Intent(this,explorescreen::class.java)
            startActivity(intent)
        }

    }
}