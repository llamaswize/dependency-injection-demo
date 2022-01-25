package com.wizeline.di.presentation

import androidx.lifecycle.ViewModel
import com.wizeline.di.domain.AnalyticsService

class MainViewModel(
    private var analytics: AnalyticsService
) : ViewModel() {

    fun doCoolStuff() {
        println("Doing cool stuff!")
        analytics.registerEvent("clicked")
    }

}