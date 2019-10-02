package com.example.paggingcoroutine.repository

import com.example.paggingcoroutine.data.resultLiveData
import com.example.paggingcoroutine.db.UserDao
import com.example.paggingcoroutine.remotedatasource.NewsUpdateRemoteDataSource
import javax.inject.Inject

class NewsUpdateRepository @Inject constructor(private val userDao: UserDao, private val dataSource: NewsUpdateRemoteDataSource) {


    val selectedNews = resultLiveData (
        databaseQuery = {userDao.fetchAllData()},
        networkCall = {dataSource.fetchAllNews()},
        saveInLocalDb = {userDao.insertUserData(it.results)}
    )
}