package com.example.paggingcoroutine.remotedatasource

import android.util.Log
import androidx.paging.PageKeyedDataSource
import com.example.paggingcoroutine.model.NewsUpdateResponse
import com.example.paggingcoroutine.repository.NewsUpdateRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.cancel
import kotlinx.coroutines.launch

class MenuFoodsDataSource (private val scope: CoroutineScope, private val repository: NewsUpdateRepository): PageKeyedDataSource<Int,  NewsUpdateResponse>(){

    companion object {
        private const val FIRST_PAGE = 1
    }

    override fun loadInitial(params: LoadInitialParams<Int>, callback: LoadInitialCallback<Int, NewsUpdateResponse>) {
        scope.launch {
            try {
                val response = repository.selectedNews
                when {
                    response.isSuccessful->{
                        callback.onResult(response.body()?: listOf(), null, FIRST_PAGE+1 )
                    }
                }

            }catch (e: Exception){
                Log.e ("Erorr", "$e")
            }
        }
    }

    override fun loadAfter(params: LoadParams<Int>, callback: LoadCallback<Int, NewsUpdateResponse>) {
        scope.launch {
            try {
                val response = repository.selectedNews
                when {
                    response.isSuccessful -> {
                        callback.onResult(response.body() ?: listOf(), params.key+1)
                    }
                }
            } catch (e: Exception) {
                Log.e ("Erorr", "$e")
            }
        }
    }

    override fun loadBefore(params: LoadParams<Int>, callback: LoadCallback<Int, NewsUpdateResponse>) {

    }

    override fun invalidate() {
        super.invalidate()
        scope.cancel()
    }
}