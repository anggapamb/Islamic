package com.islamicapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.islamicapp.databinding.ActivitySholatBinding

class SholatActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySholatBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySholatBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbarSholat)

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}