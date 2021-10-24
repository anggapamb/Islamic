package com.islamicapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.islamicapp.R
import com.islamicapp.databinding.ActivityAboutAcitivityBinding

class AboutAcitivity : AppCompatActivity() {

    private lateinit var binding: ActivityAboutAcitivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutAcitivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbarAbout)

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}