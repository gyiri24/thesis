package com.example.thesis

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.thesis.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnTime.setOnClickListener{
            binding.tvData.text = Date(System.currentTimeMillis()).toString()
        }
        
    }
}