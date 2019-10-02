package com.example.paggingcoroutine.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData
import com.example.paggingcoroutine.common.Result
import kotlinx.coroutines.Dispatchers
import okhttp3.Dispatcher

fun <T, A> resultLiveData (databaseQuery: ()-> LiveData<T>,
                           networkCall: suspend()-> Result <A>,
                           saveInLocalDb: suspend (A) -> Unit) : LiveData <Result<T>> =
    liveData (Dispatchers.IO){

        emit(Result.loading<T>())

    }