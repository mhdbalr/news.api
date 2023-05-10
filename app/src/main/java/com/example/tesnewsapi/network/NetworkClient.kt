package com.example.tesnewsapi.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NetworkClient {

    const val  BASE_URL ="https://6254434289f28cf72b5aed04.mockapi.io/"

    val instance : ApiService by lazy {
        val retrofit= Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        retrofit.create(ApiService::class.java)
    }
}