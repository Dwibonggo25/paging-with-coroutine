package com.example.paggingcoroutine.di.module

import com.example.paggingcoroutine.AppDatabase
import com.example.paggingcoroutine.api.ApiService
import com.example.paggingcoroutine.db.UserDao
import com.example.paggingcoroutine.remotedatasource.NewsUpdateRemoteDataSource
import com.example.paggingcoroutine.repository.NewsUpdateRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Provides
    @Singleton
    fun providesUserDao (db: AppDatabase) = db.userDao()

    @Provides
    @Singleton
    fun providesNewsUpdateRepository (userDao: UserDao, dataSource: NewsUpdateRemoteDataSource): NewsUpdateRepository = NewsUpdateRepository (userDao, dataSource)

}