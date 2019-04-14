package com.dheeraj.simpledagger.di.modules

import com.dheeraj.simpledagger.di.ActivityScope
import com.dheeraj.simpledagger.di.CarName
import com.dheeraj.simpledagger.di.ToyotaCar
import com.dheeraj.simpledagger.model.Car
import dagger.Module
import dagger.Provides

@Module
class ToyotaCarModule {
    @Provides
    @CarName
    fun provideName() : String = "Toyota Innova"

    @Provides
    @ActivityScope
    @ToyotaCar
    fun provideCar(car: Car) = car
}