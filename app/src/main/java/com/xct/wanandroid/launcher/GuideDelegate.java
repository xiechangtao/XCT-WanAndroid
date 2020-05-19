package com.xct.wanandroid.launcher;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;

import com.xct.wanandroid.base.PrimaryDelegate;

/**
 * 项目名   : xct-WanAndroid
 * 包名     : com.xct.wanandroid.launcher
 * 文件名   : GuideDelegate
 * 创建者   :  xct
 * 创建时间 :  2020/5/19 17:52
 * 描述     :  新手引导页面，只展示一次
 */
public class GuideDelegate extends PrimaryDelegate {

    @Override
    public Object setLayout() {
        return null;
    }

    @Override
    public void onBindView(@NonNull Bundle saveInstanceState, @NonNull View rootView) {

    }
}
