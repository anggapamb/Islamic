package com.islamicapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.islamicapp.R
import com.islamicapp.databinding.ActivityDoaHarianBinding

class DoaHarianActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDoaHarianBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDoaHarianBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbarDoaHarian)

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}