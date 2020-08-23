package com.ssindher.kointutorial.data.repository

import com.ssindher.kointutorial.data.api.ApiHelper

class MainRepository(private val apiHelper: ApiHelper) {

    suspend fun getUsers() = apiHelper.getUsers()

}