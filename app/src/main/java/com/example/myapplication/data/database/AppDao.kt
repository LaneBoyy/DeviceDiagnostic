package com.example.myapplication.data.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.myapplication.data.database.entity.*

@Dao
interface AppDao {

    @Query("SELECT * FROM companies WHERE id == :id LIMIT 1")
    suspend fun getCompanyById(id: Int): CompanyDb

    @Query("SELECT * FROM zones WHERE id == :id LIMIT 1")
    suspend fun getZoneById(id: Int): ZoneDb

    @Query("SELECT * FROM devices WHERE id == :id LIMIT 1")
    suspend fun getDeviceById(id: Int): DeviceDb

    @Query("SELECT * FROM hrcards WHERE id == :id LIMIT 1")
    suspend fun getHrCardById(id: Int): HrCardDb

    @Query("SELECT * FROM reports WHERE id == :id LIMIT 1")
    suspend fun getReportById(id: Int): ReportDb


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun setCompanes(listItems: List<CompanyDb>)


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun setZones(listItems: List<ZoneDb>)


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun setDevices(listItems: List<DeviceDb>)


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun setHrCards(listItems: List<HrCardDb>)


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun setReports(listItems: List<ReportDb>)

}