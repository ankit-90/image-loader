package com.imageloader.com.imageloader;

import android.support.annotation.DrawableRes;
import android.text.TextUtils;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.List;

import static com.imageloader.com.imageloader.AppContextProvider.getContext;


/**
 * Created by ankit on 15/3/17.
 */

public class PicassoImageLoader implements ImageLoader{

    private static PicassoImageLoader picassoImageLoader;

    private PicassoImageLoader() {
    }


    public static PicassoImageLoader getInstance(){
        if(picassoImageLoader == null){
            picassoImageLoader = new PicassoImageLoader();
        }
        return picassoImageLoader;
    }

    @Override
    public void show(String url, ImageView imageView) {
        if (TextUtils.isEmpty(url)) url = "notavail";
        Picasso.with(getContext()).load(url).error(R.drawable.ic_placeholder).into(imageView);
    }

    @Override
    public void show(List<String> urls, ImageView imageView) {
        String url = "notavail";
        if (urls != null && urls.size() > 0 && !TextUtils.isEmpty(urls.get(0))) {
            url = urls.get(0);
        }
        show(url, imageView);
    }

    @Override
    public void show(@DrawableRes int id, ImageView imageView) {
        Picasso.with(getContext()).load(id).error(R.drawable.ic_placeholder).into(imageView);
    }
}
