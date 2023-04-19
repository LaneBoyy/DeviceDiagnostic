package com.example.myapplication.data.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "hrcards")
data class HrCardDb(
    @PrimaryKey
    val id: Int,
    val workerId: Int,
    val fullName: String,
    val workInfo: List<Pair<Pair<Long, Long>, Pair<String, Int>>> //Список Пара(Пара(Дата начала, дата окончания), Пара(должность, Zone.id))
)