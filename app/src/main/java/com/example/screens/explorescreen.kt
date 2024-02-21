package com.example.screens

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class explorescreen : AppCompatActivity() {

    private lateinit var bottomNavigationBar: BottomNavigationView
    private lateinit var bottomNavigationBar1: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explorescreen)

        bottomNavigationBar = findViewById(R.id.navigation_bar)
        bottomNavigationBar1 = findViewById(R.id.navigation_bar1)
        bottomNavigationBar.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.item1 -> {
                    // Handle item1 reselection
                    true
                }

                R.id.item2 -> {
                    // Handle item2 reselection
                    true
                }

                R.id.item3 -> {
                    // Handle item3 reselection
                    true
                }

                R.id.item4 -> {
                    // Handle item4 reselection
                    true
                }

                R.id.item5 -> {
                    // Handle item5 reselection
                    true
                }

                // Handle other items as needed
                else -> false
            }
        }
        bottomNavigationBar1.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.item1 -> {
                    // Handle item1 reselection
                    true
                }

                R.id.item2 -> {
                    // Handle item2 reselection
                    true
                }

                R.id.item3 -> {
                    // Handle item3 reselection
                    true
                }

                else -> false
            }
        }

    }
}
