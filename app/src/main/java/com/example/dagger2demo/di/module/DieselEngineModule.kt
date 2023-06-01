package com.example.dagger2demo.di.module

import com.example.dagger2demo.car.engine.DieselEngine
import com.example.dagger2demo.car.engine.Engine
import dagger.Binds
import dagger.Module

@Module
interface DieselEngineModule {

    @Binds
    fun provideDieselEngine(dieselEngine: DieselEngine): Engine

}