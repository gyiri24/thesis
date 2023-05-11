package com.example.thesis

import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.thesis.databinding.FragmentRegistrationBinding

class RegistrationActivity : AppCompatActivity() {

    private lateinit var binding: FragmentRegistrationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentRegistrationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.termsText.setOnClickListener {
            showTermsDialog()
        }

        binding.privacyText.setOnClickListener {
            showPrivacyDialog()
        }

    }

    private fun showTermsDialog() {
        val termsDialog = AlertDialog.Builder(this)
            .setTitle(getString(R.string.terms_text))
            .setMessage(getString(R.string.terms_full_text))
            .setPositiveButton(getString(R.string.ok)) { dialog, _ ->
                dialog.dismiss()
            }
            .create()
        termsDialog.show()
    }

    private fun showPrivacyDialog() {
        val privacyDialog = AlertDialog.Builder(this)
            .setTitle(getString(R.string.privacy_text))
            .setMessage(getString(R.string.privacy_full_text))
            .setPositiveButton(getString(R.string.ok)) { dialog, _ ->
                dialog.dismiss()
            }
            .create()
        privacyDialog.show()
    }

}
