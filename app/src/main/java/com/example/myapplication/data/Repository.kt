package com.example.myapplication.data

import android.app.Application
import com.example.myapplication.data.database.AppDatabase
import com.example.myapplication.data.database.entity.DeviceDb
import com.example.myapplication.data.database.entity.ZoneDb
import com.example.myapplication.ui.Data

class Repository(application: Application, private val data: Data) {

    private val appDao = AppDatabase.getInstance(application)

    fun getCurrentDevices(): Pair<List<DeviceDb>, ZoneDb> {
        return data.getCurrentDevices()
    }

    fun getWorkers() = data.getCurrentEmployee()
}