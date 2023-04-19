package com.example.myapplication.ui

import com.example.myapplication.data.database.entity.DeviceDb
import com.example.myapplication.data.database.entity.HrCardDb
import com.example.myapplication.data.database.entity.ZoneDb

interface Data {
    fun getCurrentDevices(): Pair<List<DeviceDb>, ZoneDb>

    fun getCurrentEmployee(): List<HrCardDb>
}