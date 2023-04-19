package com.example.myapplication.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityWorkerBinding

class WorkerActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityWorkerBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val listWorker = App.repository.getWorkers()
        var text = ""
        listWorker.forEach {
            val textAdd = "Имя: ${it.fullName}, Должность: ${it.workInfo[0].second.first}\n"
            text += textAdd
        }
        binding.tvWorkers.text = text
    }
}