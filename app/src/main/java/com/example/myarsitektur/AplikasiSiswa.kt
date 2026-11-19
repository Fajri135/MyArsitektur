package com.example.myarsitektur

import android.app.Application
import com.example.myarsitektur.repositori.ContainerApp
import com.example.myarsitektur.repositori.ContainerDataApp

class AplikasiSiswa : Application() {
    lateinit var container: ContainerApp
    override fun onCreate() {
        super.onCreate()
        container = ContainerDataApp(this)
    }
}
