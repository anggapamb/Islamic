package com.islamicapp.model

import com.google.gson.annotations.SerializedName

data class AsmaulHusnaResponse(

	@field:SerializedName("code")
	val code: Int? = null,

	@field:SerializedName("data")
	val data: ArrayList<DataAsmaulHusna>,

	@field:SerializedName("status")
	val status: String? = null
)

data class DataAsmaulHusna(

	@field:SerializedName("number")
	val number: Int? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("en")
	val en: En? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class En(

	@field:SerializedName("meaning")
	val meaning: String? = null
)
