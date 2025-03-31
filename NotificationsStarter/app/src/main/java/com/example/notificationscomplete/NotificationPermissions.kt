package com.example.notificationscomplete

import android.Manifest.permission.POST_NOTIFICATIONS
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import android.provider.Settings
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.annotation.RequiresApi
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalContext
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

@RequiresApi(Build.VERSION_CODES.TIRAMISU)
@Composable
fun RequestNotificationPermissions() {

}

@RequiresApi(Build.VERSION_CODES.TIRAMISU)
@Composable
private fun CheckAndRequestPermission(
    context: Context,
    launcher: ActivityResultLauncher<String>
) {

}

@Composable
private fun PermissionSettingsDialog(
    show: Boolean,
    onDismissClose: () -> Unit,
    onDismiss: () -> Unit,
    context: Context
) {

}

// Extension function for Context
// Opens the settings menu, is called if the user clicks confirm
private fun Context.openAppSettings() {
    startActivity(Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    })
}

//Android 18(?)+ only allows for this to happen twice, if you deny twice it won't ask again
//If we need the permission for the app to work we need to do something else
@RequiresApi(Build.VERSION_CODES.TIRAMISU)
private fun shouldShowRationale(context: Context): Boolean {
    return ActivityCompat.shouldShowRequestPermissionRationale(
        context as Activity,
        POST_NOTIFICATIONS
    )
}