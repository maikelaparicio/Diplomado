package com.uapa.maikel.diplomado.data.source.network

import com.uapa.maikel.diplomado.data.model.User
import retrofit2.http.GET
import io.reactivex.Observable

interface UserApi {
    @GET("/users")
    fun getUsers(): Observable<List<User>>
}