package com.dheeraj.simpledagger.model

import com.dheeraj.simpledagger.di.CarName
import javax.inject.Inject

class Car @Inject constructor(
    @CarName val name: String
) {
    fun displayName() {
        //Displays the name of the car
    }
}