package com.example.loginapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.example.loginapp.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonEnter.setOnClickListener {
            val username = binding.usernameInput.text.toString()
            val password = binding.passwordInput.text.toString()

            if(username.equals("user") && password.equals("pass")) {
                Toast.makeText(applicationContext, "Login successfully", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, LoginOkActivity::class.java))
            } else {
                Toast.makeText(applicationContext, "Login failed", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, LoginErrorActivity::class.java))
            }

            binding.usernameInput.setText("")
            binding.passwordInput.setText("")
        }
    }
}

