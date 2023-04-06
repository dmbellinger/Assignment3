package com.hfad.networkingdemo
// Dylan Bellinger and Steven Griffin
// Assignment 3
// 4/6/2023

//Movie data class
data class MoviesItem(
    val description: String,
    val director: List<String>,
    val genre: List<String>,
    val id: String,
    val image: String,
    val imdbid: String,
    val rank: Int,
    val rating: String,
    val thumbnail: String,
    val title: String,
    val trailer: String,
    val writers: List<String>,
    val year: Int
)