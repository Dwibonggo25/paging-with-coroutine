package com.example.paggingcoroutine.di.module

import com.example.paggingcoroutine.api.ApiService
import com.example.paggingcoroutine.db.UserDao
import com.example.paggingcoroutine.remotedatasource.NewsUpdateRemoteDataSource
import com.example.paggingcoroutine.repository.NewsUpdateRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RemoteDataSource {

    @Provides
    @Singleton
    fun providesNewsUpdateRemoteDataSource (apiService: ApiService) = NewsUpdateRemoteDataSource (apiService)

}