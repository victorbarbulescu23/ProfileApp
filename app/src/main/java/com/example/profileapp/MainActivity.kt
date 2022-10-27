package com.example.profileapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var nextButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nextButton = findViewById(R.id.next_screen_button)
        nextButton.setOnClickListener {
            Intent(this@MainActivity, MyBioActivity::class.java).also{
                startActivity(it)
            }

        }


    }
}