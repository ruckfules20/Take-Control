package com.example.myapplication

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.example.myapplication.*;
public class AppBlockService extends Service {

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        // Start blocking other apps
        startForeground(1, new Notification());
        return START_STICKY;
    }
}
