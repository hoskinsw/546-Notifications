package com.example.notificationscomplete

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.O)
fun createBasicNotification(context: Context) {

}

@RequiresApi(Build.VERSION_CODES.O)
fun createCollapsableNotification(context: Context) {

}

private fun setPendingIntent(context: Context): PendingIntent? {
    return null
}

@RequiresApi(Build.VERSION_CODES.O)
private fun getNotificationChannel(
    context: Context,
    notificationManager: NotificationManager,
    channelId: String
) {

}
