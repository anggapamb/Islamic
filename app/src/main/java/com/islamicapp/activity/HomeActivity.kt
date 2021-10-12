package com.islamicapp.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import com.islamicapp.databinding.ActivityHomeBinding
import com.islamicapp.fragment.AllMenuFragment

class HomeActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //transparant status bar
        window.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)

    }

    override fun onClick(p0: View?) {
        when (p0) {
            binding.linearMenuLainnya -> {
                val bottomSheetAllMenu = AllMenuFragment()
                bottomSheetAllMenu.show(supportFragmentManager, "bottomsheet")
            }

            binding.linearAsmaulHusna -> {
                startActivity(Intent(this, AsmaulHusnaActivity::class.java))
            }

            binding.linearTahlil -> {
                startActivity(Intent(this, TahlilActivity::class.java))
            }
        }
    }
}