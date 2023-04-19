package com.example.myapplication.data.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "devices")
data class DeviceDb(
    @PrimaryKey
    val id: Int,
    val name: String,
    val startDate: Long,
    val endDate: Long,
    val hrCardId:Int // Int = hrCard.id
)
