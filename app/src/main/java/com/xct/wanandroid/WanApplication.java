package com.xct.wanandroid;

import android.app.Application;
import android.support.multidex.MultiDexApplication;

import com.xct.core.app.Latte;

/**
 * 项目名   : xct-WanAndroid
 * 包名     : com.xct.xct_wanandroid
 * 文件名   : WanApplication
 * 创建者   :  xct
 * 创建时间 :  2020/5/16 15:19
 * 描述     :  主 application
 */
public class WanApplication extends MultiDexApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        Latte.init(this)
                .withLoaderDelayed(1000)
                .withApiHost("")
                .withJavascriptInterface("")
                .configure();


    }


    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
    }



    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }
}
