package com.islamicapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.islamicapp.model.AsmaulHusnaResponse
import com.islamicapp.model.DataAsmaulHusna
import com.islamicapp.retrofit.ApiService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class AsmaulHusnaViewModel : ViewModel() {

    private val listAsmaulHusna = MutableLiveData<ArrayList<DataAsmaulHusna>?>()

    fun setAsmaulHusna() {
        val data = ArrayList<DataAsmaulHusna>()

        ApiService.instanceAsmaulHusna.getAsmaulHusna().enqueue(object : Callback<AsmaulHusnaResponse>{
            override fun onResponse(call: Call<AsmaulHusnaResponse>, response: Response<AsmaulHusnaResponse>) {

                data.clear()
                val data99 = response.body()?.data
                data99?.let { data.addAll(it) }

                listAsmaulHusna.postValue(data)

            }

            override fun onFailure(call: Call<AsmaulHusnaResponse>, t: Throwable) {
                listAsmaulHusna.postValue(null)
            }
        })

    }

    fun getAsmaulHusna(): LiveData<ArrayList<DataAsmaulHusna>?> {
        return listAsmaulHusna
    }

}