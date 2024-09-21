package com.example.recyclerewards.activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import com.example.recyclerewards.CategoryListScreen
import com.example.recyclerewards.helper.PreferenceHelper
import com.example.recyclerewards.helper.PreferenceHelperImpl
import com.example.recyclerewards.ui.theme.RecycleRewardsTheme
import com.example.recyclerewards.ui.theme.UserLoginScreen
import com.example.recyclerewards.viewmodel.AuthenticationViewModel
import com.example.recyclerewards.viewmodel.CategoryViewmodel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {


    lateinit var prerference: PreferenceHelper

    private val authViewModel: AuthenticationViewModel by viewModels()
    private val categoryViewmodel: CategoryViewmodel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        prerference = PreferenceHelperImpl(this)
        enableEdgeToEdge()
        setContent {
            Log.d("TAG", "onCreate: ${prerference.userLoggedIn}")
            RecycleRewardsTheme {
                if (prerference.userLoggedIn.not())
                    UserLoginScreen(onLoginClick = ::handleLogin)
                else
                    CategoryListScreen(categories = categoryViewmodel.fetchCategory())
            }
        }
    }

    private fun handleLogin(email: String, password: String) {
        if (authViewModel.handleLogin(email, password)) {
            prerference.userLoggedIn = true
            startActivity(Intent(this@MainActivity, CategoryActivity::class.java))
        } else {
            Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this@MainActivity, CategoryActivity::class.java))
        }
    }
}


