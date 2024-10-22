package com.example.loginapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.loginapp.databinding.ActivityLoginOkBinding

class LoginOkActivity : ComponentActivity() {

    private lateinit var binding: ActivityLoginOkBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginOkBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonLogout.setOnClickListener {
            finish()
        }
    }
}