package com.example.cyrptocurrencyapp.presentation.navGraph

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import com.example.cyrptocurrencyapp.presentation.onboarding.OnBoardingScreen
import com.example.cyrptocurrencyapp.presentation.onboarding.OnBoardingViewModel

@Composable
fun NavGraph(
    startDestination: String
){
    val navController= rememberNavController()
    NavHost(navController=navController,startDestination=startDestination){
        navigation(route = Route.AppStartNavigation.route,
            startDestination = Route.onBoardingScreen.route
        ){
            composable(route = Route.onBoardingScreen.route){
                val viewModel:OnBoardingViewModel=hiltViewModel()
               OnBoardingScreen(event = viewModel::onEvent)
            }

        }
        navigation(
            route = Route.CryptoNavigation.route,
            startDestination = Route.CryptoNavigatorScreen.route){
            composable(route = Route.CryptoNavigatorScreen.route){
            }
        }
    }

}