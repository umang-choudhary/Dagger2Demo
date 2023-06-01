package com.example.dagger2demo.di.component

import com.example.dagger2demo.MainActivity
import com.example.dagger2demo.car.Car
import com.example.dagger2demo.di.module.DieselEngineModule
import com.example.dagger2demo.di.module.WheelsModule
import com.example.dagger2demo.di.qualifier.EngineCapacity
import com.example.dagger2demo.di.qualifier.HorsePower
import com.example.dagger2demo.di.scope.PerActivity
import dagger.BindsInstance
import dagger.Subcomponent

@PerActivity
@Subcomponent(
    modules = [WheelsModule::class, DieselEngineModule::class]
)
interface ActivityComponent {

    // provision method
    // fun getCar(): Car

    // When there are multiple dependencies and constructor injection is not possible in consuming class,
    // use inject method for field injection.
    fun injectMainActivityMembers(mainActivity: MainActivity)

    /*@Subcomponent.Builder
    interface Builder {

        fun horsePower(@BindsInstance @HorsePower horsePower: Int): Builder

        fun engineCapacity(@BindsInstance @EngineCapacity engineCapacity: Int): Builder

        fun build(): ActivityComponent

    }*/

    @Subcomponent.Factory
    interface Factory {
        fun create(
            @BindsInstance @HorsePower horsePower: Int,
            @BindsInstance @EngineCapacity engineCapacity: Int
        ): ActivityComponent
    }

}