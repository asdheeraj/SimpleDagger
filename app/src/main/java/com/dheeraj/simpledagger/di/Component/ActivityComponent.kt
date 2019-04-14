package com.dheeraj.simpledagger.di.Component

import com.dheeraj.simpledagger.MainActivity
import com.dheeraj.simpledagger.di.ActivityScope
import com.dheeraj.simpledagger.di.ToyotaCar
import com.dheeraj.simpledagger.di.modules.ActivityModule
import com.dheeraj.simpledagger.di.modules.ToyotaCarModule
import com.dheeraj.simpledagger.model.Car
import dagger.Component

@ActivityScope
@Component(
    dependencies = [ApplicationComponent::class],
    modules = [ActivityModule::class,
            ToyotaCarModule::class]
)
interface ActivityComponent {

    fun inject(activity: MainActivity)

    @ToyotaCar
    fun getCar() : Car
}