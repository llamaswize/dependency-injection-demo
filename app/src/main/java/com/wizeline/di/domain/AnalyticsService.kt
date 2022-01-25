package com.wizeline.di.domain

interface AnalyticsService {
    fun registerEvent(eventName: String)
}