package com.example.myapplication.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityGetCurrentDeviceBinding
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*


class GetCurrentDeviceActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityGetCurrentDeviceBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val neededItems = App.repository.getCurrentDevices()
        val devices = neededItems.first
        val zone = neededItems.second
        var text = "Количество оборудования: ${devices.size}\n"
        devices.forEach {
            val formatter: DateFormat = SimpleDateFormat("HH:mm", Locale.US)
            formatter.setTimeZone(TimeZone.getTimeZone("UTC"))
            val startDate: String = formatter.format(Date(it.startDate))
            val textAdd = "Название: ${it.name}\n Зарегистрирован: ${startDate}\n"
            text += textAdd
        }
        binding.devices.text = text
        binding.zones.text =
            "Название: ${zone.name}, Координаты: ${zone.latitude}, ${zone.longitude} "
    }
}