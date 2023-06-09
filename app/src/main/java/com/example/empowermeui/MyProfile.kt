package com.example.empowermeui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatDelegate

class MyProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_profile)


        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        val btnGotoFinancialSupport= findViewById<ImageButton>(R.id.FSPbtn)

        btnGotoFinancialSupport.setOnClickListener {
            val intent = Intent(this, FinancialSupport::class.java)
            startActivity(intent)
        }
        val btnGotoNotification= findViewById<ImageButton>(R.id.notificationbtn)

        btnGotoNotification.setOnClickListener {
            val intent = Intent(this, Notifications::class.java)
            startActivity(intent)
        }

        val btnAboutus= findViewById<ImageButton>(R.id.btnaboutus)

        btnAboutus.setOnClickListener {
            val intent = Intent(this, AboutUs::class.java)
            startActivity(intent)
        }
    }
}