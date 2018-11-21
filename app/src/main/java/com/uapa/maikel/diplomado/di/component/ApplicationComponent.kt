package com.uapa.maikel.diplomado.di.component


import com.uapa.maikel.diplomado.di.module.AppModule
import com.uapa.maikel.diplomado.di.module.NetworkModule
import com.uapa.maikel.diplomado.presenter.UserPresenterImpl
import com.uapa.maikel.diplomado.ui.ApplicationClass
import dagger.Component

@Component(modules = [AppModule::class, NetworkModule::class])
interface ApplicationComponent {

    fun inject(newApplication: ApplicationClass)
    fun inject(mUserPresenterImpl: UserPresenterImpl)
}