package com.islamicapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.islamicapp.R
import com.islamicapp.databinding.ActivityTahlilBinding

class TahlilActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTahlilBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTahlilBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //setToolbar
        setSupportActionBar(binding.toolbarTahlil)

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}