package com.example.screens

import android.os.Bundle
import android.view.View
import android.widget.PopupMenu
import android.widget.SeekBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Refinescreen : AppCompatActivity() {
    private lateinit var menuview:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_refinescreen)

        val seekBar: SeekBar = findViewById(R.id.seekbar)
        menuview = findViewById(R.id.menuview)

        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                // Handle progress change
                // The 'progress' variable now ranges from 1 to 100
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                // Called when the user starts moving the thumb
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                // Called when the user stops moving the thumb
                val progress = seekBar.progress
            }
        })
    }

    fun showPopupMenu(view: View) {
        val textViewOptions = findViewById<TextView>(R.id.menuview)

        val popupMenu = PopupMenu(this, textViewOptions)
        popupMenu.menuInflater.inflate(R.menu.menu, popupMenu.menu)

        popupMenu.setOnMenuItemClickListener { item ->
            when (item.itemId) {
                R.id.item1 -> {
                    menuview.setText("Available | Hey Let Us Connect")
                }
                R.id.item2 -> {
                    menuview.setText("Away | Stay Discrete And Watch")
                }
                R.id.item3 -> {
                    menuview.setText("Busy | Do Not Disturb | Will Catch Up Later")
                }
                R.id.item4 -> {
                    menuview.setText("SOS | Emergency! Need Assistance! HELP")
                }

            }
            true
        }

        popupMenu.show()
    }
}