package com.example.dagger2demo.car

import android.util.Log
import com.example.dagger2demo.Constants
import javax.inject.Inject

class Remote @Inject constructor() {

    fun setListener(car: Car) {
        Log.d(Constants.TAG, "Remote connected with $car")
    }
}