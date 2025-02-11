package com.runtimeappiconchanges

import android.app.Activity
import android.content.ComponentName
import android.content.pm.PackageManager

class Utils {

    companion object{

        fun Activity.changeIcon(
            enabled: String,
            disabled: String
        ) {
            // Enable the specified component (e.g., alias for app icon)
            packageManager.setComponentEnabledSetting(
                ComponentName(this, enabled),
                PackageManager.COMPONENT_ENABLED_STATE_ENABLED,
                PackageManager.DONT_KILL_APP
            )

            // Disable the other components to ensure only one icon is active
            packageManager.setComponentEnabledSetting(
                ComponentName(this, disabled),
                PackageManager.COMPONENT_ENABLED_STATE_DISABLED,
                PackageManager.DONT_KILL_APP
            )
        }


    }
}