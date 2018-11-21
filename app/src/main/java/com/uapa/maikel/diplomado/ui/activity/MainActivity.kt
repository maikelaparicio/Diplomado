package com.uapa.maikel.diplomado.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.uapa.maikel.diplomado.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()/*, CreateUserView */{

    /***
     * lazy es una función que durante la primera invocación ejecuta el lambda que se le haya pasado y en posteriores invocaciones retornará el valor computado inicialmente
     */
   /* private val presenter: CreateUserPresenter<CreateUserView> by lazy {
        CreateUserPresenterImpl(this)
    }*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSaveUser.setOnClickListener {
            Log.i("Click Save USER", "Working")
            Toast.makeText(this, "Guardando Usuario", Toast.LENGTH_LONG).show()
            //presenter.saveUser(userName.text.toString(), userSurname.text.toString())
        }
    }

    /*override fun showEmptyNameError() {
        userName.error = getString(R.string.name_empty_error)
    }

    override fun showEmptySurnameError() {
        userSurname.error = getString(R.string.surname_empty_error)
    }

    override fun showUserSaved() {
        Toast.makeText(this, R.string.user_saved, Toast.LENGTH_LONG).show()
    }

    override fun showUserDetails(user: User) {
        //startActivity<UserDetailsActivity>(USER_KEY to user)
    }
*/
    override fun onDestroy() {
        //presenter.onDestroy()
        super.onDestroy()
    }
}
