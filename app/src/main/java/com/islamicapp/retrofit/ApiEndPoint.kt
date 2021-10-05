package com.islamicapp.retrofit

import com.islamicapp.model.AsmaulHusnaResponse
import retrofit2.Call
import retrofit2.http.GET

interface ApiEndPoint {

    @GET("/asmaAlHusna")
    fun getAsmaulHusna(): Call<AsmaulHusnaResponse>

}