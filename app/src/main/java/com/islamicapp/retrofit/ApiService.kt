package com.islamicapp.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiService {

    private const val BASE_URL_ASMAUL_HUSNA = "https://api.aladhan.com"

    val instanceAsmaulHusna: ApiEndPoint by lazy {
        val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL_ASMAUL_HUSNA)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

        retrofit.create(ApiEndPoint::class.java)
    }

}