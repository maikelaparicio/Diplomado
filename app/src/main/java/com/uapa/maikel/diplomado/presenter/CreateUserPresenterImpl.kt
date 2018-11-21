package com.uapa.maikel.diplomado.presenter

/*
class CreateUserPresenterImpl(override var view: CreateUserView?): CreateUserPresenter<CreateUserView> {

    override fun saveUser(name: String, surname: String) {
        val user = User(name, surname)
        when(UserValidator.validateUser(user)){
            UserError.EMPTY_NAME -> view?.showEmptyNameError()
            UserError.EMPTY_SURNAME -> view?.showEmptySurnameError()
            UserError.NO_ERROR -> {
                UserStore.saveUser(user)
                view?.showUserSaved()
                view?.showUserDetails(user)
            }
        }
    }

}*/
