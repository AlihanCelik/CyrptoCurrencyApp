package com.example.cyrptocurrencyapp.data.manger

import android.content.Context
import com.example.cyrptocurrencyapp.domain.manger.LocalUserManger
import kotlinx.coroutines.flow.Flow
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.preferencesDataStore
import com.example.cyrptocurrencyapp.util.Constants
import com.example.cyrptocurrencyapp.util.Constants.USER_SETTINGS
import kotlinx.coroutines.flow.map

class LocalUserMangerImpl(
    val context: Context
) :LocalUserManger{
    private val Context.dataStore:DataStore<Preferences> by preferencesDataStore(name=USER_SETTINGS)
    private object PreferencesKeys{
        val APP_ENTRY= booleanPreferencesKey(name = Constants.APP_ENTRY)
    }
    override suspend fun saveAppEntry() {
        context.dataStore.edit {settiings->
            settiings[PreferencesKeys.APP_ENTRY]=true
        }
    }

    override fun readAppEntry(): Flow<Boolean> {
        return context.dataStore.data.map {preferences->
            preferences[PreferencesKeys.APP_ENTRY]?:false

        }
    }
}