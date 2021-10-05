package com.islamicapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.islamicapp.databinding.ItemAsmaulHusnaBinding
import com.islamicapp.model.DataAsmaulHusna

class AsmaulHusnaAdapter (private val item: ArrayList<DataAsmaulHusna>):
        RecyclerView.Adapter<AsmaulHusnaAdapter.AsmaulHusnaViewHolder>() {

    class AsmaulHusnaViewHolder(val binding: ItemAsmaulHusnaBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AsmaulHusnaViewHolder {
        val binding = ItemAsmaulHusnaBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AsmaulHusnaViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AsmaulHusnaViewHolder, position: Int) {
        val dataAsmaulHusna = item[position]
        holder.binding.apply {
            textEn.text = dataAsmaulHusna.en?.meaning
            textAr.text = dataAsmaulHusna.name
            textBacaan.text = dataAsmaulHusna.transliteration
        }
    }

    override fun getItemCount(): Int {
        return item.size
    }

}