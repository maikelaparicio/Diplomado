package com.uapa.maikel.diplomado.ui.activity


import android.os.Bundle
import android.util.Log
import com.uapa.maikel.diplomado.R
import com.uapa.maikel.diplomado.data.model.User
import com.uapa.maikel.diplomado.presenter.UserPresenterImpl
import com.uapa.maikel.diplomado.ui.view.UserListView
import android.support.v7.widget.LinearLayoutManager
import com.uapa.maikel.diplomado.ui.adapter.UserItemAdapter
import kotlinx.android.synthetic.main.activity_users.*


class UserActivity : BaseActivity(), UserListView {

    var userPresenter: UserPresenterImpl? = null

    override fun setLayout(): Int {
        return R.layout.activity_users
    }

    override fun init(savedInstanceState: Bundle?) {
        getPresenter()?.let {
            it.getAllUsers()
        }
    }

    fun getPresenter(): UserPresenterImpl? {
        userPresenter = UserPresenterImpl(this, application)
        return userPresenter
    }

    override fun onStartScreen() {
    }

    override fun stopScreen() {
        userPresenter?.let {
            userPresenter!!.unbindView()
            userPresenter = null
        }

    }

    override fun showAllUsers(userList: List<User>) {
        Log.d("Response", "" + userList)
        rv_users_list.layoutManager = LinearLayoutManager(this)
        rv_users_list.adapter = UserItemAdapter(userList, this)
    }

}