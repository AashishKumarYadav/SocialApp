package com.example.social

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bGpt = findViewById<Button>(R.id.gpt)

        val social = findViewById<Button>(R.id.social)

       // val num = "98971413144"

        bGpt.setOnClickListener{
            Toast.makeText(applicationContext,"Opening",Toast.LENGTH_SHORT).show()

            intent = Intent(applicationContext,ChatGPT::class.java)
            startActivity(intent)
        }

        social.setOnClickListener{
            Toast.makeText(applicationContext,"Connecting",Toast.LENGTH_SHORT).show()

            intent = Intent(applicationContext,SocialMedia::class.java)
            startActivity(intent)
        }

    }
}
