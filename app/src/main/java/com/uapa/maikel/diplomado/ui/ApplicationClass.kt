package com.uapa.maikel.diplomado.ui

import android.app.Application
import com.uapa.maikel.diplomado.di.component.ApplicationComponent
import com.uapa.maikel.diplomado.di.component.DaggerApplicationComponent
import com.uapa.maikel.diplomado.di.module.NetworkModule


open class ApplicationClass : Application() {


    public lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()

        applicationComponent = DaggerApplicationComponent.builder()
                .networkModule(NetworkModule())
                .build()

        applicationComponent.inject(this)
    }
}