package com.uapa.maikel.diplomado.ui.activity

/*class UserDetailsActivity : AppCompatActivity(), UserDetailsView {

    private val presenter: UserDetailsPresenter<UserDetailsView> by lazy {
        UserDetailsPresenterImpl(this)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_details)

        val user = intent.getParcelableExtra<User>(USER_KEY)
        presenter.user = user
    }

    override fun showUserDetails(user: User) {
        userFullName.setText("${user.name} ${user.surname}")
    }

    override fun showNoUserError() {
        Toast.makeText(this, R.string.no_user_error, Toast.LENGTH_LONG).show()
        finish()
    }

    override fun onDestroy() {
        presenter.onDestroy()
        super.onDestroy()
    }
}*/
