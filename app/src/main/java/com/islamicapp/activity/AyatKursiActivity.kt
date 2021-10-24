package com.islamicapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.islamicapp.R
import com.islamicapp.databinding.ActivityAyatKursiBinding

class AyatKursiActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAyatKursiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAyatKursiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbarAyatKursi)

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}