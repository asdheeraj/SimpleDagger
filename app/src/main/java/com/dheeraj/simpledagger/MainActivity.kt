package com.dheeraj.simpledagger

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.dheeraj.simpledagger.di.Component.ActivityComponent
import com.dheeraj.simpledagger.di.Component.DaggerActivityComponent
import com.dheeraj.simpledagger.di.MarutiCar
import com.dheeraj.simpledagger.di.ToyotaCar
import com.dheeraj.simpledagger.di.modules.ActivityModule
import com.dheeraj.simpledagger.model.Car
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    lateinit var activityComponent: ActivityComponent

    @Inject
    @field:MarutiCar
    lateinit var marutiCar: Car

    @Inject
    @field:ToyotaCar
    lateinit var toyotaCar: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        activityComponent = DaggerActivityComponent
            .builder()
            .applicationComponent((application as MyApplication).applicationComponent)
            .activityModule(ActivityModule(this))
            .build()

        activityComponent.inject(this)

        Log.d("MainActivity: ", "${marutiCar.hashCode()}: ${marutiCar.name}")
        Log.d("MainActivity: ", "${toyotaCar.hashCode()}: ${toyotaCar.name}")

        @SuppressLint("SetTextI18n")
        tv_displayName.text = "${marutiCar.name}, ${toyotaCar.name}"

    }
}
