package com.example.cyrptocurrencyapp.presentation.onboarding

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cyrptocurrencyapp.domain.usercases.app_entry.AppEntryUsesCases
import dagger.hilt.android.HiltAndroidApp
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class OnBoardingViewModel @Inject constructor(
    private val appEntryUsesCases: AppEntryUsesCases
):ViewModel(){
    fun onEvent(event: onBoardingEvent){
        when(event){
            is onBoardingEvent.SaveAppEntry->{
                saveAppEntry()
            }
        }
    }
    private fun saveAppEntry(){
        viewModelScope.launch {
            appEntryUsesCases.saveAppEntry
        }
    }
}