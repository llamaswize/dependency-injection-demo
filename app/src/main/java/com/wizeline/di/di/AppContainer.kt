package com.wizeline.di.di

import com.wizeline.di.domain.AnalyticsService
import com.wizeline.di.firebase.FirebaseAnalyticsService

class AppContainer {
    val analytics: AnalyticsService = FirebaseAnalyticsService()
}