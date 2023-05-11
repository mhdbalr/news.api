package com.example.tesnewsapi.network

import com.example.tesnewsapi.model.Source
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("top-headlines/sources")
    fun getAllSources(
        @Query("category") category: String,
        @Query("apikey") apikey: String = "88e326e7a89c42ceaa972aa96e01c73b"
    ): Call<List<Source>>
}


