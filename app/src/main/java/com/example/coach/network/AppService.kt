package com.example.coach.network

import com.example.coach.models.Root
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface AppService {

    @GET("Users/GetProfile")
    fun getUser(@Header("Authorization") Authorization: String?, @Query("pMobile") mobile: String?): Call <Root>?
}