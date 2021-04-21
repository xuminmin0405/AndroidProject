package com.google.androidproject.config;

import android.app.Application;

/**
 * AndroidProject
 * <p>
 * Created by xuminmin on 2018/12/16.
 * Email: iminminxu@gmail.com
 * Copyright © 2018年 Hangzhou Gravity Cyberinfo. All rights reserved.
 * Application
 */
public class App extends Application {

    private static App instance;

    public static App getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }
}