package com.example.myapplication.data.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "zones")
data class ZoneDb(
    @PrimaryKey
    val id: Int,
    val name: String,
    val latitude: Long,
    val longitude: Long,
//    val devices: List<Int>,
    val reports: List<Int> //Int = reports
)
