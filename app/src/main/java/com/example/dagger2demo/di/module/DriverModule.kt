package com.example.dagger2demo.di.module

import com.example.dagger2demo.car.Driver
import dagger.Module
import dagger.Provides

@Module
class DriverModule(val name: String) {

    @Provides
    fun provideDriver(): Driver {
        return Driver(name)
    }

}