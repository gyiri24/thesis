package com.example.aclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.aclass.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var myCar = Car("abc-123", 1232312)

        println(myCar.showPlateAndEngine())
    }
}