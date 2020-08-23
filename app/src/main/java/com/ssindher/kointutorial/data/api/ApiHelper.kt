package com.ssindher.kointutorial.data.api

import com.ssindher.kointutorial.data.model.User
import retrofit2.Response

interface ApiHelper {

    suspend fun getUsers(): Response<List<User>>

}