package com.wizeline.di

import android.app.Application
import com.google.firebase.FirebaseApp
import com.wizeline.di.di.AppContainer

class App : Application() {

    lateinit var appContainer: AppContainer

    override fun onCreate() {
        super.onCreate()
        FirebaseApp.initializeApp(applicationContext)
        appContainer = AppContainer()
    }
}