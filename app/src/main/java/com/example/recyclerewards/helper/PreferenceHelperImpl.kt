package com.example.recyclerewards.helper

import android.content.Context
import android.content.SharedPreferences
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PreferenceHelperImpl @Inject constructor (
    @ApplicationContext context: Context) :PreferenceHelper {

    val name: String = "recycle-reward"
    private val USER_LOGGIN = Pair("USER_LOGGIN", false)
    private var preferences : SharedPreferences = context.getSharedPreferences(name, Context.MODE_PRIVATE)


    protected inline fun SharedPreferences.edit(operation: (SharedPreferences.Editor) -> Unit) {
        val editor = edit()
        operation(editor)
        editor.apply()
    }

    override var userLoggedIn: Boolean
        get() = preferences.getBoolean(USER_LOGGIN.first, USER_LOGGIN.second)
        set(value) = preferences.edit {
            it.putBoolean(USER_LOGGIN.first, value)
        }

}
