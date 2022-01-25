package com.wizeline.di.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.viewModels
import com.wizeline.di.App
import com.wizeline.di.R
import com.wizeline.di.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val app = application as App
        val appContainer = app.appContainer
        val analytics = appContainer.analytics
        viewModel = MainViewModel(analytics)

        findViewById<Button>(R.id.button).setOnClickListener {
            viewModel.doCoolStuff()
        }

    }
}