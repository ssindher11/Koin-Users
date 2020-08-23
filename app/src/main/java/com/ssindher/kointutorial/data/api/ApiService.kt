package com.ssindher.kointutorial.data.api

import com.ssindher.kointutorial.data.model.User
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("users")
    suspend fun getUsers(): Response<List<User>>

}