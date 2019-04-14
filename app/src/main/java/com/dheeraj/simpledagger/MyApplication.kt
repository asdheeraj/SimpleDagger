package com.dheeraj.simpledagger

import android.app.Application
import android.util.Log
import com.dheeraj.simpledagger.di.Component.ApplicationComponent
import com.dheeraj.simpledagger.di.Component.DaggerApplicationComponent
import com.dheeraj.simpledagger.di.MarutiCar
import com.dheeraj.simpledagger.di.modules.ApplicationModule
import com.dheeraj.simpledagger.model.Car
import javax.inject.Inject

class MyApplication :Application() {

    lateinit var applicationComponent: ApplicationComponent

    @Inject
    @field:MarutiCar
    lateinit var marutiCar: Car

    override fun onCreate() {
        super.onCreate()

        applicationComponent = DaggerApplicationComponent
            .builder()
            .applicationModule(ApplicationModule(this))
            .build()
           applicationComponent.inject(this)

        Log.d("MyApplication","${marutiCar.hashCode()}: ${marutiCar.name}")

    }
}