package com.example.paggingcoroutine.api

import com.example.paggingcoroutine.model.NewsUpdateResponse
import com.example.paggingcoroutine.model.ResultsResponse
import com.example.paggingcoroutine.model.Source
import com.example.paggingcoroutine.ui.NewsUpdateAdapter
import io.reactivex.Single
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET ("/everything?q=sports&apiKey=aa67d8d98c8e4ad1b4f16dbd5f3be348")
    suspend fun getNewsUpdate (@Query ("page")page : Int?= null,  @Query("pageSize") pageSize: Int? = null) : Response <ResultsResponse<Source>>
}