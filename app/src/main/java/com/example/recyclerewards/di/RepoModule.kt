package com.example.recyclerewards.di

import android.content.Context
import com.example.recyclerewards.helper.PreferenceHelper
import com.example.recyclerewards.helper.PreferenceHelperImpl
import dagger.Provides
import dagger.hilt.android.qualifiers.ApplicationContext

internal object RepoModule {

    @Provides
    fun providePreference(
        @ApplicationContext context: Context,
        preferenceImpl: PreferenceHelperImpl
    ): PreferenceHelper {
        return preferenceImpl
    }

}