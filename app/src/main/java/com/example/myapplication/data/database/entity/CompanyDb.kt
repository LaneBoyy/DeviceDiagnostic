package com.example.myapplication.data.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "companies")
data class CompanyDb (
    @PrimaryKey
    val id: Int,
    val name: String,
    val shortName: String,
    val OffAdress: String,
    val zones: List<Int> //Int = Zone.id
)