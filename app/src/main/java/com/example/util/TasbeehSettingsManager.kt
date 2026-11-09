package com.example.util

import android.content.Context
import android.content.SharedPreferences

object TasbeehSettingsManager {

    private const val PREFS_NAME = "tasbeeh_control_settings"
    private const val KEY_SHAKE_ENABLED = "key_shake_to_count_enabled"
    private const val KEY_VOLUME_ENABLED = "key_volume_keys_to_count_enabled"
    private const val KEY_SELECTED_DHIKR_ID = "key_selected_dhikr_id"
    private const val KEY_SELECTED_GOAL = "key_selected_goal"

    private fun getPrefs(context: Context): SharedPreferences {
        return context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
    }

    fun isShakeToCountEnabled(context: Context): Boolean {
        return getPrefs(context).getBoolean(KEY_SHAKE_ENABLED, false)
    }

    fun setShakeToCountEnabled(context: Context, enabled: Boolean) {
        getPrefs(context).edit().putBoolean(KEY_SHAKE_ENABLED, enabled).apply()
    }

    fun isVolumeKeysToCountEnabled(context: Context): Boolean {
        return getPrefs(context).getBoolean(KEY_VOLUME_ENABLED, false)
    }

    fun setVolumeKeysToCountEnabled(context: Context, enabled: Boolean) {
        getPrefs(context).edit().putBoolean(KEY_VOLUME_ENABLED, enabled).apply()
    }

    fun getSavedSelectedDhikrId(context: Context): Int {
        return getPrefs(context).getInt(KEY_SELECTED_DHIKR_ID, -1)
    }

    fun setSavedSelectedDhikrId(context: Context, dhikrId: Int) {
        getPrefs(context).edit().putInt(KEY_SELECTED_DHIKR_ID, dhikrId).apply()
    }

    fun getSavedSelectedGoal(context: Context): Int {
        return getPrefs(context).getInt(KEY_SELECTED_GOAL, -1)
    }

    fun setSavedSelectedGoal(context: Context, goal: Int) {
        getPrefs(context).edit().putInt(KEY_SELECTED_GOAL, goal).apply()
    }
}
