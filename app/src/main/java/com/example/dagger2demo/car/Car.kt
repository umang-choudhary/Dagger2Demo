package com.example.dagger2demo.car

import android.util.Log
import com.example.dagger2demo.Constants
import com.example.dagger2demo.car.engine.Engine
import com.example.dagger2demo.car.wheel.Wheels
import com.example.dagger2demo.di.scope.PerActivity
import javax.inject.Inject

@PerActivity
class Car @Inject constructor() { // Constructor injection
    // -> Can not define @Inject on multiple constructors in a class.
    // Order of execution -> Constructor inject - Field injection - Method injection

    // Field injection
    @Inject
    lateinit var mEngine: Engine

    @Inject
    lateinit var mWheels: Wheels

    @Inject
    lateinit var mDriver: Driver

    // Method injection
    @Inject
    fun enableRemote(remote: Remote) {
        remote.setListener(this)
    }

    fun drive() {
        mWheels.inflate()
        mEngine.start()
        Log.d(Constants.TAG, "$mDriver ${mDriver.name} is driving $this")
    }

}