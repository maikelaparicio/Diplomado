package com.uapa.maikel.diplomado.presenter

import android.support.annotation.CallSuper
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

/*
interface Presenter<T : View> {
    var view: T?

    fun onDestroy(){
        view = null
    }
}

interface CreateUserPresenter<T : View>: Presenter<T> {
    fun saveUser(name: String, surname: String)
}

interface UserDetailsPresenter<T : View>: Presenter<T> {
    var user: User?
}*/

open class Preseneter<V>(@Volatile var view: V?) {


    companion object {
        var compositeDisposables: CompositeDisposable = CompositeDisposable()
    }


    init {
    }


    protected fun view(): V? {
        return view
    }

    @CallSuper
    fun unbindView() {
        if (compositeDisposables != null) {
            compositeDisposables.clear()
            compositeDisposables.dispose()
        }
        this.view = null
    }

    fun addDisposable(disposable: Disposable) {
        compositeDisposables.add(disposable)
    }


}