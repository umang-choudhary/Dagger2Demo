package com.example.dagger2demo.di.module

import com.example.dagger2demo.car.wheel.Rims
import com.example.dagger2demo.car.wheel.Tyres
import com.example.dagger2demo.car.wheel.Wheels
import dagger.Module
import dagger.Provides

@Module
object WheelsModule {

    @Provides
    fun provideRims(): Rims {
        return Rims()
    }

    @Provides
    fun provideTyres(): Tyres {
        return Tyres()
    }

    @Provides
    fun provideWheels(rims: Rims, tyres: Tyres): Wheels {
        return Wheels(rims, tyres)
    }

}