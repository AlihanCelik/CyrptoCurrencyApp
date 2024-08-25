package com.example.cyrptocurrencyapp.domain.usercases.app_entry

import com.example.cyrptocurrencyapp.domain.manger.LocalUserManger
import kotlinx.coroutines.flow.Flow

class ReadAppEntry(
    private val localUserManger:LocalUserManger
) {
   operator fun invoke():Flow<Boolean>{
       return localUserManger.readAppEntry()
   }
}