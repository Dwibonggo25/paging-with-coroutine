package com.example.paggingcoroutine.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName = "source")
data class Source (

    @PrimaryKey (autoGenerate = true)
    @ColumnInfo (name = "id")
    val id : Int,

    @ColumnInfo (name = "name")
    val name: String
){
    constructor(): this(0,"")
}