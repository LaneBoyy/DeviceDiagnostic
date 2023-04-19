package com.example.myapplication.data.database.entity

import android.location.Geocoder
import android.location.Location
import android.location.LocationManager
import com.example.myapplication.ui.Data
import java.util.concurrent.TimeUnit

class DataImpl : Data {
    override fun getCurrentDevices(): Pair<List<DeviceDb>, ZoneDb> {
        return Pair(
            listOf(
                DeviceDb(
                    0,
                    "Трансформатор 3",
                    System.currentTimeMillis() - TimeUnit.HOURS.toMillis(4),
                    System.currentTimeMillis() + TimeUnit.DAYS.toMillis(1),
                    1,
                ),
                DeviceDb(
                    1,
                    "Трансформатор 2",
                    System.currentTimeMillis() - TimeUnit.HOURS.toMillis(2),
                    System.currentTimeMillis() + TimeUnit.DAYS.toMillis(2),
                    1,
                ),
                DeviceDb(
                    2,
                    "Трансформатор 1",
                    System.currentTimeMillis() - TimeUnit.HOURS.toMillis(1),
                    System.currentTimeMillis() + TimeUnit.HOURS.toMillis(5),
                    1,
                ),
            ),
            ZoneDb(
                0,
                "SpaceX",
                557522,
                376156,
                listOf(2)
            )
        )
    }

    override fun getCurrentEmployee(): List<HrCardDb> {
        return listOf<HrCardDb>(
            HrCardDb(0, 10, "Иванов Иван Иванович", listOf(Pair(Pair(0L, 0L), Pair("Инженер", 0)))),
            HrCardDb(
                1,
                11,
                "Сергеев Сергей Сергеевич",
                listOf(Pair(Pair(0L, 0L), Pair("Главный инженер", 0)))
            ),
            HrCardDb(
                2,
                12,
                "Иванов Иван Иванович",
                listOf(Pair(Pair(0L, 0L), Pair("Инженер-электрик", 0)))
            )
        )
    }

    companion object {
        private val time = TimeUnit.MINUTES.toMillis(2)
    }
}