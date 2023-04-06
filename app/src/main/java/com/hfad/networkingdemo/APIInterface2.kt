package com.hfad.networkingdemo
// Dylan Bellinger and Steven Griffin
// Assignment 3
// 4/6/2023
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import retrofit2.http.GET
import retrofit2.http.Headers

interface APIInterface2 {
    //API interface for new API.
    @GET("/")
    //Headers for data retrieval
    @Headers("X-RapidAPI-Key:e506080d5cmsh9c4350d94622d47p1b39b5jsn0495f2405d5f", "X-RapidAPI-Host:imdb-top-100-movies.p.rapidapi.com")
    fun getMovies() : Call<ArrayList<MoviesItem?>?>?

    companion object{
        //Base URL for API
        var BASE_URL = "https://imdb-top-100-movies.p.rapidapi.com/"
        fun create(): APIInterface2{
            //Implementing the base URL
            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build()
            return retrofit.create(APIInterface2::class.java)
        }
    }


}