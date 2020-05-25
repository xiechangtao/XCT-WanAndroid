package com.xct.core.util;

import android.content.res.Resources;
import android.util.DisplayMetrics;

import com.xct.core.app.Latte;

/**
 * 项目名   : xct-WanAndroid
 * 包名     : com.xct.core.util
 * 文件名   : ScreenUtils
 * 创建者   :  xct
 * 创建时间 :  2020/5/22 14:08
 * 描述     :  屏幕工具
 */
public class ScreenUtils {


    public static int getScreenHeight() {
        final Resources resources = Latte.getApplicationContext().getResources();
        final DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return displayMetrics.widthPixels;
    }


    public static int getScreenWeight() {
        Resources resources = Latte.getApplicationContext().getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return displayMetrics.heightPixels;
    }

}
