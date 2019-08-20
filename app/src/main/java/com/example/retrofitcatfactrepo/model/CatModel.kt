package com.example.retrofitcatfactrepo.model

import com.google.gson.annotations.SerializedName

data class CatModel (

	@SerializedName("used") val used : Boolean,
	@SerializedName("source") val source : String,
	@SerializedName("type") val type : String,
	@SerializedName("deleted") val deleted : Boolean,
	@SerializedName("_id") val _id : String,
	@SerializedName("updatedAt") val updatedAt : String,
	@SerializedName("createdAt") val createdAt : String,
	@SerializedName("user") val user : String,
	@SerializedName("text") val text : String,
	@SerializedName("__v") val __v : Int
)