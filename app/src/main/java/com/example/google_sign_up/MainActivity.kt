package com.example.google_sign_up

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.google_sign_up.databinding.ActivityMainBinding

lateinit var  banding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        banding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(banding.root)
        banding.button.setOnClickListener {
            Toast.makeText(this, "complete", Toast.LENGTH_SHORT).show()
        }

    }

}