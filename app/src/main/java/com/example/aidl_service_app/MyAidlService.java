package com.example.aidl_service_app;

import android.app.Service;
import android.content.Intent;
import android.graphics.Color;
import android.os.IBinder;
import android.os.RemoteException;

import java.util.Random;

public class MyAidlService extends Service {
    public MyAidlService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return  binder;
    }


    IMyAidlInterface.Stub binder= new IMyAidlInterface.Stub() {
        @Override
        public int getColor() throws RemoteException {
            Random rnd = new Random();
            return Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));

        }
    };


}