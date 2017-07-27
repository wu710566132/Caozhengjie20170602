package com.bwie.test.caozhengjie20170602;

import android.app.Application;

import com.uuzuche.lib_zxing.activity.ZXingLibrary;

/**
 * Date：2017/6/2
 * author: 曹政杰Administrator.
 * function：
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ZXingLibrary.initDisplayOpinion(this);
    }

}
