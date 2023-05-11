package com.example.thesis.ui.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.thesis.databinding.FragmentRegistrationBinding

class RegistrationFragment: Fragment() {

    private lateinit var binding: FragmentRegistrationBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding.registrationButton.setOnClickListener() {
            Toast.makeText(activity, "DEMO", Toast.LENGTH_LONG).show()
        }

        return binding.root
    }
}