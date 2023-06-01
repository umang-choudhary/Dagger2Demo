package com.example.dagger2demo.car.wheel

import android.util.Log
import com.example.dagger2demo.Constants

class Wheels constructor(rims: Rims, tyres: Tyres) {
    // We don't own this class

    var mRims: Rims = rims

    var mTyres: Tyres = tyres

    fun inflate() {
        Log.d(Constants.TAG, "Wheels inflated")
    }

}