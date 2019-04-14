package com.dheeraj.simpledagger.di.modules

import android.app.Application
import android.content.Context
import com.dheeraj.simpledagger.MyApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule(val application: MyApplication) {

    @Provides
    @Singleton
    fun provideApplication() : Application = application

    @Provides
    @Singleton
    fun provideContext() : Context = application

}