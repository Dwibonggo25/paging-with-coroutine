package com.example.paggingcoroutine.repository

import com.example.paggingcoroutine.api.ApiService
import com.example.paggingcoroutine.db.UserDao
import javax.inject.Inject

class LoginRepository @Inject constructor(private val userDao: UserDao, private val apiservice: ApiService) {

}