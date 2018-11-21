package com.uapa.maikel.diplomado.presenter

import android.app.Application
import com.uapa.maikel.diplomado.data.source.network.UserApi
import com.uapa.maikel.diplomado.ui.ApplicationClass
import com.uapa.maikel.diplomado.ui.view.UserListView
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.internal.schedulers.IoScheduler
import javax.inject.Inject

class UserPresenterImpl(var userlistView: UserListView, var applicationComponent: Application) : UserPresenter,
    Preseneter<UserListView>(userlistView) {

    @Inject
    lateinit var userApi: UserApi

    init {
        (applicationComponent as ApplicationClass).applicationComponent.inject(this)
    }

    override fun getAllUsers() {
        var view = view()

        view?.let {
            it.showLoading()
            var allPosts = userApi.getUsers()
            addDisposable(allPosts.subscribeOn(IoScheduler()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                    { result ->
                        view?.let {
                            it.hideLoading()
                            userlistView.showAllUsers(result)

                        }
                    },
                    { error ->
                        view?.let {
                            it.hideLoading()
                        }
                    }
                ))
        }

        var allPosts = userApi.getUsers()
        allPosts.subscribeOn(IoScheduler()).observeOn(AndroidSchedulers.mainThread())
            .subscribe {
                userlistView.showAllUsers(it)
            }
    }

}