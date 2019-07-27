package ru.skillbranch.devintensive.repositories

import android.content.SharedPreferences
import android.preference.PreferenceManager
import ru.skillbranch.devintensive.models.Profile

object PreferencesRepository {
    private val prefs: SharedPreferences by lazy {
        val ctx = null
        PreferenceManager.getDefaultSharedPreferences(ctx)
    }

    fun getProfileData(): Profile? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun saveProfileData(profile: Profile) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun getProfile(): Profile? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun saveProfile(profile: Profile) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}