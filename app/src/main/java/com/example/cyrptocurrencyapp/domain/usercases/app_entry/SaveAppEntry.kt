package com.example.cyrptocurrencyapp.domain.usercases.app_entry

import com.example.cyrptocurrencyapp.domain.manger.LocalUserManger

class SaveAppEntry(
    private val localUserManger: LocalUserManger
) {
    suspend operator fun invoke(){
        localUserManger.saveAppEntry()
    }
}