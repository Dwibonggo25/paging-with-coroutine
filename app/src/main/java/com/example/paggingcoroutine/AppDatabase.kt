package com.example.paggingcoroutine

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.paggingcoroutine.db.Source
import com.example.paggingcoroutine.db.UserDao

@Database(entities = [Source::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

    abstract fun userDao(): UserDao

}