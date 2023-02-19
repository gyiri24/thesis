package com.example.fibonacci

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fibonacci.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPlus.setOnClickListener {
            if(!binding.etLength.text.isEmpty()
                && !binding.etLengthSecond.text.isEmpty()) {
                var number = binding.etLength.text.toString().toInt()
                var numberTwo = binding.etLengthSecond.text.toString().toInt()
                add(number, numberTwo)
            } else {
                if(binding.etLength.text.isEmpty()) {
                    binding.etLength.error = "Ez a mező nem lehet üres"
                } else {
                    binding.etLengthSecond.error = "Ez a mező nem lehet üres"
                }
            }
        }

        binding.btnMinus.setOnClickListener {
            if(!binding.etLength.text.isEmpty()
                && !binding.etLengthSecond.text.isEmpty()) {
                var number = binding.etLength.text.toString().toInt()
                var numberTwo = binding.etLengthSecond.text.toString().toInt()
                substract(number, numberTwo)
            } else {
                if(binding.etLength.text.isEmpty()) {
                    binding.etLength.error = "Ez a mező nem lehet üres"
                } else {
                    binding.etLengthSecond.error = "Ez a mező nem lehet üres"
                }
            }
        }
    }
    
    /*fun fibonacci(n: Int = 10) {
        var t1 = 0
        var t2 = 1
        var i = 1

        binding.tvResult.text = ""

        while (i <= n) {
            binding.tvResult.append("$t1 ")
            val sum = t1 + t2
            t1 = t2
            t2 = sum

            i++
        }
    }*/

    fun add(number: Int, numberTwo: Int) {
        binding.tvResult.text = ""
        var result = number + numberTwo
        binding.tvResult.append("$result ")
    }

    fun substract(number: Int, numberTwo: Int) {
        binding.tvResult.text = ""
        var result = number - numberTwo
        binding.tvResult.append("$result ")
    }
}