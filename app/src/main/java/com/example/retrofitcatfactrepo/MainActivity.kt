package com.example.retrofitcatfactrepo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.retrofitcatfactrepo.model.CatModel
import com.example.retrofitcatfactrepo.network.RetrofitInstance
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val catRetrofitInterface = RetrofitInstance().retrofitInstance.create(CatRetrofitInterface::class.java)
        val call = catRetrofitInterface.getUserRepo("cat", "15")
        call.enqueue(object : Callback<List<CatModel>> {
            override fun onFailure(call: Call<List<CatModel>>, t: Throwable) {
                Log.d("ERrorMain", t.message)
            }

            override fun onResponse(call: Call<List<CatModel>>, response: Response<List<CatModel>>) {
                val res = response.body()
                Log.d("MainActivity", res!![0].type)
            }
        });
    }
}
