package com.hfad.networkingdemo

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import retrofit2.http.GET

interface APIInterface2 {
    @GET("imdb-top-100-movies/")
    fun getMovies() : Call<ArrayList<Movie?>?>?

    companion object{
        var BASE_URL = "https://rapidapi.com/rapihub-rapihub-default/api/"

        fun create(): ApiInterface{
            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build()
            return retrofit.create(ApiInterface::class.java)
        }
    }


}