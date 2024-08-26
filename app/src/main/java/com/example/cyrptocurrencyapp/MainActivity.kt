package com.example.cyrptocurrencyapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.cyrptocurrencyapp.presentation.navGraph.NavGraph
import com.example.cyrptocurrencyapp.presentation.onboarding.OnBoardingScreen
import com.example.cyrptocurrencyapp.presentation.onboarding.OnBoardingViewModel
import com.example.cyrptocurrencyapp.presentation.onboarding.onBoardingEvent
import com.example.cyrptocurrencyapp.ui.theme.CyrptoCurrencyAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    val viewModel by viewModels<MainViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val viewModel2 by viewModels<OnBoardingViewModel>()

        setContent {
            CyrptoCurrencyAppTheme {
                Box(modifier = Modifier.background(color = MaterialTheme.colorScheme.background)){
                    val startDestination=viewModel.startDestination
                    NavGraph(startDestination = startDestination)
                }
            }
        }
    }
}
