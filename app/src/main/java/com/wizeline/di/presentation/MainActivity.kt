package com.wizeline.di.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.wizeline.di.App
import com.wizeline.di.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val app = application as App
        val appContainer = app.appContainer
        val analytics = appContainer.analytics
        viewModel = MainViewModel(analytics)

        binding.button.setOnClickListener {
            viewModel.doCoolStuff()
        }

    }
}