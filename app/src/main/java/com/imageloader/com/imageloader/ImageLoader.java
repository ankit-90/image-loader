package com.imageloader.com.imageloader;

import android.support.annotation.DrawableRes;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by ankit on 15/3/17.
 */

public interface ImageLoader {

    void show(String url, ImageView imageView);

    void show(List<String> urls, ImageView imageView);

    void show(@DrawableRes int id, ImageView imageView);

}
