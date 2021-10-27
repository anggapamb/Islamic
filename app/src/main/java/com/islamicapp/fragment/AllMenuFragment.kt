package com.islamicapp.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.islamicapp.R
import com.islamicapp.activity.*
import com.islamicapp.databinding.FragmentAllMenuBinding

class AllMenuFragment : BottomSheetDialogFragment() {

    private var _binding: FragmentAllMenuBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        _binding = FragmentAllMenuBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //set action
        binding.apply {

            allMenuAsmaulHusna.setOnClickListener {
                startActivity(Intent(requireContext(), AsmaulHusnaActivity::class.java))
            }

            allMenuTahlil.setOnClickListener {
                startActivity(Intent(requireContext(), TahlilActivity::class.java))
            }

            allMenuAbout.setOnClickListener {
                startActivity(Intent(requireContext(), AboutAcitivity::class.java))
            }

            allMenuAyatKursi.setOnClickListener {
                startActivity(Intent(requireContext(), AyatKursiActivity::class.java))
            }

            allMenuDoaHarian.setOnClickListener {
                startActivity(Intent(requireContext(), DoaHarianActivity::class.java))
            }

            allMenuSholat.setOnClickListener {
                startActivity(Intent(requireContext(), SholatActivity::class.java))
            }

        }

    }

    override fun getTheme(): Int {
        return R.style.AppBottomSheetDialogTheme
    }



}