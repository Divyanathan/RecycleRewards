package com.example.recyclerewards
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import com.example.recyclerewards.ui.theme.CategoryActivity
import com.example.recyclerewards.ui.theme.RecycleRewardsTheme
import com.example.recyclerewards.ui.theme.UserLoginScreen
import com.example.recyclerewards.viewmodel.AuthenticationViewModel

class MainActivity : ComponentActivity() {

    private val authViewModel: AuthenticationViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RecycleRewardsTheme {
                UserLoginScreen(onLoginClick = ::handleLogin)
            }
        }
    }

    private fun handleLogin(email: String, password: String) {
        if (authViewModel.handleLogin(email,password)){
            startActivity(Intent(this@MainActivity,CategoryActivity::class.java))
        }else{
            Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this@MainActivity,CategoryActivity::class.java))
        }
    }
}


