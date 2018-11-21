package com.uapa.maikel.diplomado.data.model

import com.google.gson.annotations.SerializedName

/***
 *Interfaz para las clases cuyas instancias se pueden escribir y restaurar desde a Parcel. Las clases que implementan la
 *  interfaz Parcelable también deben tener un campo estático no nulo llamado CREATOR de un tipo que implementa
 *  la Parcelable.Creatorinterfaz.
 */

data class User(
    @SerializedName("id") val userId:Int,
    @SerializedName("name") val name:String,
    @SerializedName("username") val username:String,
    @SerializedName("email") val email:String,
    @SerializedName("phone") val phone:String,
    @SerializedName("website") val website:String
)

/*data class User(val name: String, val username: String, val email: String, val phone: String, val website: String) :
    Parcelable {
    constructor(source: Parcel) : this(
        source.readString(),
        source.readString(),
        source.readString(),
        source.readString(),
        source.readString()
    )

    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(dest: Parcel?, flags: Int) {
        dest?.writeString(name)
        dest?.writeString(username)
    }

    *//***
     * un companion object, es un objeto que es común a todas las instancias de esa clase
     *//*
    companion object {
        @JvmField
        final val CREATOR: Parcelable.Creator<User> = object : Parcelable.Creator<User> {
            override fun createFromParcel(source: Parcel): User {
                return User(source)
            }

            override fun newArray(size: Int): Array<User?> {
                return arrayOfNulls(size)
            }
        }
    }
}*/

enum class UserError {
    EMPTY_NAME,
    EMPTY_SURNAME,
    NO_ERROR
}

object UserStore {
    fun saveUser(user: User) {
    }
}

object UserValidator {

    fun validateUser(user: User): UserError {
        with(user) {
            if (name.isNullOrEmpty()) return UserError.EMPTY_NAME
            if (username.isNullOrEmpty()) return UserError.EMPTY_SURNAME
        }

        return UserError.NO_ERROR
    }
}