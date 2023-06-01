package com.example.dagger2demo

import android.app.Application
import com.example.dagger2demo.di.component.AppComponent
import com.example.dagger2demo.di.component.DaggerAppComponent
import com.example.dagger2demo.di.module.DriverModule

class DemoApp : Application() {

    // Dagger 1 - Developed by square, use reflection to create dependency at runtime.
    // Dagger 2 - Developed by google, create dependencies at compile time.
    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.builder().driverModule(DriverModule("Umang")).build()
    }

    fun getAppComponent(): AppComponent {
        return appComponent
    }

}