package com.dheeraj.simpledagger.di.modules

import com.dheeraj.simpledagger.di.CarName
import com.dheeraj.simpledagger.di.MarutiCar
import com.dheeraj.simpledagger.model.Car
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class MarutiCarModule {
    @Provides
    @CarName
    fun provideName(): String = "Maruti Swift Dzire"

    @Provides
    @Singleton
    @MarutiCar
    fun provideCar(car:Car) = car
}