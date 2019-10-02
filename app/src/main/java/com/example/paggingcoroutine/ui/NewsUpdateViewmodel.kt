package com.example.paggingcoroutine.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.DataSource
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import com.example.paggingcoroutine.model.NewsUpdateResponse
import com.example.paggingcoroutine.remotedatasource.MenuFoodsDataSource
import com.example.paggingcoroutine.repository.NewsUpdateRepository
import javax.inject.Inject

class NewsUpdateViewmodel @Inject constructor(private val repository: NewsUpdateRepository): ViewModel() {

    var postsLiveData  : LiveData<PagedList<NewsUpdateResponse>>

    init {
        val config = PagedList.Config.Builder()
            .setPageSize(5)
            .setEnablePlaceholders(false)
            .build()
        postsLiveData = initializedPagedListBuilder(config).build()
    }

        private fun initializedPagedListBuilder(config: PagedList.Config): LivePagedListBuilder<Int, NewsUpdateResponse> {
        val factory = object : DataSource.Factory <Int, NewsUpdateResponse>(){
            override fun create(): DataSource<Int, NewsUpdateResponse> {
                return MenuFoodsDataSource(viewModelScope, repository)
            }
        }
        return LivePagedListBuilder<Int, NewsUpdateResponse>(factory, config)
    }

    fun getPosts():LiveData<PagedList<NewsUpdateResponse>> = postsLiveData

}