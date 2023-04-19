package com.example.myapplication.data.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "reports")
data class ReportDb(
    @PrimaryKey
    val id:Int,
    val date:Long,
    val allowDevices: List<Pair<Long, Int>> //Long = date, Int = Device
)
