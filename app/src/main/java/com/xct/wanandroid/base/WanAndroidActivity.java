package com.xct.wanandroid.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;

import com.xct.core.app.Latte;
import com.xct.wanandroid.launcher.GuideDelegate;
import com.xct.wanandroid.launcher.SplashDelegate;

import qiu.niorgai.StatusBarCompat;

/**
 * 项目名   : xct-WanAndroid
 * 包名     : com.xct.wanandroid.base
 * 文件名   : WanAndroidActivity
 * 创建者   :  xct
 * 创建时间 :  2020/5/19 17:29
 * 描述     :  主Activity
 */
public class WanAndroidActivity extends ProxyActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        Latte.getConfigurator().withActivity(this);
        // 状态栏与app界面融为一体
        StatusBarCompat.translucentStatusBar(this, true);
    }

    @Override
    public PrimaryDelegate setRootDelegate() {
        return new SplashDelegate();
    }
}
