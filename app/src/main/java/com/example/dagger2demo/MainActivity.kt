package com.example.dagger2demo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dagger2demo.car.Car
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car1: Car

    @Inject
    lateinit var car2: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val appComponent = (application as DemoApp).getAppComponent()

        /*DaggerActivityComponent.factory().create(appComponent, 125, 1800)
            .injectMainActivityMembers(this)*/

        appComponent.getActivityComponentFactory().create(130, 1680)
            .injectMainActivityMembers(this)

        /*DaggerActivityComponent.builder().appComponent(appComponent).horsePower(140)
            .engineCapacity(1600).build().injectMainActivityMembers(this)*/

        car1.drive()
        car2.drive()
    }
}