package com.example.appnombre_chaya.data.remote

import com.example.appnombre_chaya.data.model.Post
import retrofit2.http.GET

interface ApiService {

    @GET("/posts")
    suspend fun getPosts(): List<Post>

}