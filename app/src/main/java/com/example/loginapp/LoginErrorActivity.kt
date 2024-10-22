package com.example.loginapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.loginapp.databinding.ActivityLoginErrorBinding

class LoginErrorActivity : ComponentActivity() {

    private lateinit var binding: ActivityLoginErrorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginErrorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonBack.setOnClickListener {
            finish()
        }
    }
}