package com.example.mgumiero9.myapplication;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by mgumiero9 on 23/09/16.
 */
public class CrowdWeather extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
