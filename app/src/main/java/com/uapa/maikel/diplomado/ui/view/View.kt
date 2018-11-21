package com.uapa.maikel.diplomado.ui.view

import com.uapa.maikel.diplomado.data.model.User

interface View {
    abstract fun showLoading()
    abstract fun hideLoading()
    abstract fun loadError(e: Throwable)
    abstract fun loadError(msg: String)
}

interface CreateUserView : View {
    fun showEmptyNameError()
    fun showEmptySurnameError()
    fun showUserSaved()
    fun showUserDetails(user: User)
}

interface UserDetailsView : View {
    fun showUserDetails(user: User)
    fun showNoUserError()
}

interface UserListView:View{
    fun showAllUsers(userList: List<User>)
}