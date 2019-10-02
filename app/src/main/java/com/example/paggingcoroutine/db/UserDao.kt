package com.example.paggingcoroutine.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.paggingcoroutine.model.NewsUpdateResponse
import com.example.paggingcoroutine.model.Source

@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertUserData (fund: List <Source>)

    @Query ("SELECT * From source")
    fun fetchAllData() : LiveData <List<NewsUpdateResponse>>
}