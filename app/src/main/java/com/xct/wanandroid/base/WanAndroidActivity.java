package com.xct.wanandroid.base;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.xct.wanandroid.launcher.GuideDelegate;

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
    }

    @Override
    public PrimaryDelegate setRootDelegate() {
        return new GuideDelegate();
    }
}
