package com.example.recyclerewards

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class RecycleRewardApplication :Application() {
    override fun onCreate() {
        super.onCreate()
    }
}