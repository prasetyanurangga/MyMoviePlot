package com.prasetyanurangga.mymovieplot

import android.app.Application
import com.prasetyanurangga.mymovieplot.data.di.component.AppComponent
import com.prasetyanurangga.mymovieplot.data.di.component.DaggerAppComponent
import com.prasetyanurangga.mymovieplot.data.di.module.NetworkModule

class MyMoviePlotApplication: Application() {

    companion object {
        lateinit var instance: MyMoviePlotApplication
    }

    lateinit var appComponent: AppComponent

    override fun onCreate(){
        super.onCreate()
        instance = this

        appComponent = DaggerAppComponent
            .builder()
            .application(this)
            .networkModule(NetworkModule())
            .build()

    }
}