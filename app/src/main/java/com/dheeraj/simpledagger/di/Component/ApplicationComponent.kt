package com.dheeraj.simpledagger.di.Component

import com.dheeraj.simpledagger.MyApplication
import com.dheeraj.simpledagger.di.MarutiCar
import com.dheeraj.simpledagger.di.modules.ApplicationModule
import com.dheeraj.simpledagger.di.modules.MarutiCarModule
import com.dheeraj.simpledagger.model.Car
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        ApplicationModule::class,
        MarutiCarModule::class
    ]
)
interface ApplicationComponent {

    fun inject (application: MyApplication)

    @MarutiCar
    fun getCar() : Car
}