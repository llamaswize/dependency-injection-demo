package com.wizeline.di

import androidx.lifecycle.ViewModel
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.analytics.ktx.analytics
import com.google.firebase.ktx.Firebase

class MainViewModel : ViewModel() {

    private var firebaseAnalytics: FirebaseAnalytics = Firebase.analytics

    fun doCoolStuff() {
        println("Doing cool stuff!")
        firebaseAnalytics.logEvent("clicked", null)
    }

}