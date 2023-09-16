package com.example.assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.user_home)

        // Set up the BottomNavigationView
        val bottomNavigationView: BottomNavigationView = findViewById(R.id.buttom_navigation)

        // Set the initial selected item
        bottomNavigationView.selectedItemId = R.id.home

        // Set the item selected listener
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    // Handle item 1 selection
                    // Update your UI or perform actions for item 1
                    true
                }
                R.id.profile -> {
                    // Handle item 2 selection
                    // Update your UI or perform actions for item 2
                    true
                }
                // Add more cases for additional items if needed
                else -> false
            }
        }
    }


}