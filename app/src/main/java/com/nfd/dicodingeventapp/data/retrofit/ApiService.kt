package com.nfd.dicodingeventapp.data.retrofit

import com.nfd.dicodingeventapp.data.response.EventResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    @GET("events")
    fun getEvents(
        @Query("active") active: Int
    ): Call<EventResponse>
}