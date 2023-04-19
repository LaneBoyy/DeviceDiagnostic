package com.example.myapplication.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.btnCompany.setOnClickListener {
            startActivity(Intent(this, GetCurrentDeviceActivity::class.java))
        }
        binding.btnDiagnostic.setOnClickListener {
            startActivity(Intent(this, WorkerActivity::class.java))
        }
    }
}