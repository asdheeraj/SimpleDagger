package com.dheeraj.simpledagger.di

import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class MarutiCar

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class ToyotaCar

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class CarName