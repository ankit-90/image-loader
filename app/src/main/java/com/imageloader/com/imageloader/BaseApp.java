package com.imageloader.com.imageloader;

import android.app.Application;

/**
 * Created by ankit on 15/3/17.
 */

public class BaseApp extends Application{

    private static BaseApp baseApp;

    @Override
    public void onCreate() {
        super.onCreate();
        baseApp = this;
    }

    public static BaseApp getContext(){
        return baseApp;
    }

}
