package com.akhilagarwal96.icicihack;

import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

/**
 * Created by Adm on 18-Apr-17.
 */

public class MyService extends android.app.Service {
    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        Toast.makeText(this, "Services Started", Toast.LENGTH_SHORT).show();
        return START_STICKY;

    }
    @Override
    public void onDestroy() {

        Toast.makeText(this, "Services Destroyed", Toast.LENGTH_SHORT).show();

    }
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}

