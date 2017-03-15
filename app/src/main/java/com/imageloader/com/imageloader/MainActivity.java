package com.imageloader.com.imageloader;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView  imageView = (ImageView) findViewById(R.id.img_remote);
        PicassoImageLoader.getInstance()
                .show(R.mipmap.ic_launcher_round,imageView);
    }
}
