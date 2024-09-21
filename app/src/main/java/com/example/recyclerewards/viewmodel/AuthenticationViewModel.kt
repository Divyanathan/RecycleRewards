package com.example.recyclerewards.viewmodel

import androidx.lifecycle.ViewModel

class AuthenticationViewModel:ViewModel() {
    fun handleLogin(email: String, password: String) : Boolean{
        return email=="user" && password=="password"
    }
}