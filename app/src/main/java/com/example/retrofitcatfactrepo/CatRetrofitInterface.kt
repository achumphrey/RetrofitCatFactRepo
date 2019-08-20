package com.example.retrofitcatfactrepo

import android.hardware.usb.UsbEndpoint
import com.example.retrofitcatfactrepo.model.CatModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import java.time.temporal.TemporalAmount

interface CatRetrofitInterface {

    @GET("facts/random")
    fun getUserRepo(@Query("animal_type") animalType : String,
                    @Query("amount") amount: String): Call<List<CatModel>>
}