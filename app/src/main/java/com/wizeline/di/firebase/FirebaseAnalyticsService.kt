package com.wizeline.di.firebase

import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.analytics.ktx.analytics
import com.google.firebase.ktx.Firebase
import com.wizeline.di.domain.AnalyticsService

class FirebaseAnalyticsService : AnalyticsService {

    private var firebaseAnalytics: FirebaseAnalytics = Firebase.analytics

    override fun registerEvent(eventName: String) {
        println("Registered event named \"$eventName\" using firebase!")
        firebaseAnalytics.logEvent("clicked", null)
    }
}