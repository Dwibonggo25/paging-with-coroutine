package com.example.paggingcoroutine.remotedatasource

import com.example.paggingcoroutine.api.ApiService
import com.example.paggingcoroutine.repository.BaseDataSource
import javax.inject.Inject

class NewsUpdateRemoteDataSource @Inject constructor(private val apiService: ApiService) : BaseDataSource () {

    suspend fun fetchAllNews () = getResult{ apiService.getNewsUpdate(1, 5) }
}