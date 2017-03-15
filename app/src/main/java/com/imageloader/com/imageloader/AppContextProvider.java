package com.imageloader.com.imageloader;

import android.content.Context;

/**
 * Created by ankit on 15/3/17.
 */

public class AppContextProvider {

    public static Context getContext() {
        if (BaseApp.getContext() == null)
            throw new NullPointerException("Context is null. May be application not defined in Manifest");
        return BaseApp.getContext();
    }

}
