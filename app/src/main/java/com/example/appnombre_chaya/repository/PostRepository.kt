package com.example.appnombre_chaya.repository

import com.example.appnombre_chaya.data.model.Post
import com.example.appnombre_chaya.data.remote.RetrofitInstance

class PostRepository {

    suspend fun getPosts(): List<Post>{
        return RetrofitInstance.api.getPosts()
    }
}