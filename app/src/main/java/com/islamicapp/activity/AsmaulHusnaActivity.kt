package com.islamicapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.islamicapp.adapter.AsmaulHusnaAdapter
import com.islamicapp.databinding.ActivityAsmaulHusnaBinding
import com.islamicapp.viewmodel.AsmaulHusnaViewModel

class AsmaulHusnaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAsmaulHusnaBinding
    private lateinit var asmaulHusnaViewModel: AsmaulHusnaViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAsmaulHusnaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //setToolbar
        setSupportActionBar(binding.toolbarAsmaulHusna)

        //setVisibility
        binding.apply {
            progressbarAsmaulHusna.visibility = View.VISIBLE
            linearNotConnected.visibility = View.GONE
        }

        setViewModel()

    }

    private fun setViewModel() {

        asmaulHusnaViewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())
                .get(AsmaulHusnaViewModel::class.java)

        //showLoading
        binding.progressbarAsmaulHusna.visibility = View.VISIBLE

        asmaulHusnaViewModel.setAsmaulHusna()
        asmaulHusnaViewModel.getAsmaulHusna().observe(this, { data ->
            if (data != null) {

                binding.progressbarAsmaulHusna.visibility = View.GONE

                //set in recyclerview
                binding.apply {
                    recyclerviewAsmaulHusna.layoutManager = LinearLayoutManager(this@AsmaulHusnaActivity)
                    recyclerviewAsmaulHusna.adapter = AsmaulHusnaAdapter(data)
                }

            } else {

                binding.apply {
                    progressbarAsmaulHusna.visibility = View.GONE
                    linearNotConnected.visibility = View.VISIBLE
                }
                Toast.makeText(this, "Oops, jaringan internet anda bermasalah", Toast.LENGTH_LONG).show()

            }
        })

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}