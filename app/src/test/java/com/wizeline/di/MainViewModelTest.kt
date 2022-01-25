package com.wizeline.di

import com.wizeline.di.domain.AnalyticsService
import com.wizeline.di.presentation.MainViewModel
import org.junit.Test
import org.mockito.kotlin.doAnswer
import org.mockito.kotlin.mock
import org.mockito.kotlin.verify


class MainViewModelTest {

    private val analytics = mock<AnalyticsService> {
        on { registerEvent("clicked") } doAnswer {}
    }
    private val viewModel = MainViewModel(analytics)

    @Test
    fun `should register click in analytics service`() {
        // When
        viewModel.doCoolStuff()

        // Then
        verify(analytics).registerEvent("clicked")
    }
}