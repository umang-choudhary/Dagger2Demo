package com.example.dagger2demo.car.engine

import android.util.Log
import com.example.dagger2demo.Constants
import com.example.dagger2demo.di.qualifier.EngineCapacity
import com.example.dagger2demo.di.qualifier.HorsePower
import javax.inject.Inject

class DieselEngine @Inject constructor(
    @HorsePower horsePower: Int,
    @EngineCapacity engineCapacity: Int
) : Engine {

    private var mHorsePower = horsePower
    private var mEngineCapacity = engineCapacity

    override fun start() {
        Log.d(
            Constants.TAG,
            "Diesel Engine started: Horse Power - $mHorsePower ," +
                    " Engine Capacity - $mEngineCapacity"
        )
    }
}