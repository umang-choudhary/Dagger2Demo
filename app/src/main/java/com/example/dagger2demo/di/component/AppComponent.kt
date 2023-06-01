package com.example.dagger2demo.di.component

import com.example.dagger2demo.di.module.DriverModule
import dagger.Component

@Component(
    modules = [DriverModule::class]
)
interface AppComponent {

    fun getActivityComponentFactory(): ActivityComponent.Factory

}