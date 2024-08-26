package com.example.cyrptocurrencyapp

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cyrptocurrencyapp.domain.usercases.app_entry.AppEntryUsesCases
import com.example.cyrptocurrencyapp.domain.usercases.app_entry.SaveAppEntry
import com.example.cyrptocurrencyapp.presentation.navGraph.Route
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class MainViewModel@Inject constructor(
    private val appEntryUsesCases: AppEntryUsesCases
):ViewModel() {
    var splashCondition by  mutableStateOf(true)
        private set

    var startDestination by mutableStateOf(Route.AppStartNavigation.route)
         private set

    init{
        appEntryUsesCases.readAppEntry().onEach { it->
            if(it){
                startDestination=Route.CryptoNavigation.route
            }else{
                startDestination=Route.onBoardingScreen.route
            }
            delay(300)
            splashCondition=false
        }.launchIn(viewModelScope)
    }
}