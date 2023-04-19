package com.example.myapplication.ui

import android.app.Application
import com.example.myapplication.data.Repository
import com.example.myapplication.data.database.entity.DataImpl

class App:Application() {
    override fun onCreate() {
        super.onCreate()
        application = this
    }
    companion object{
        private var application: Application? = null
        val repository by lazy {
            Repository(application!!, DataImpl())
        }
    }
}