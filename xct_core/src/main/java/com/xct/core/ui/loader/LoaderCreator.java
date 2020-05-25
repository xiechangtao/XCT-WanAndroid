package com.xct.core.ui.loader;

import android.content.Context;

import com.wang.avi.AVLoadingIndicatorView;
import com.wang.avi.Indicator;

import java.util.WeakHashMap;

/**
 * 项目名   : xct-WanAndroid
 * 包名     : com.xct.core.ui.loader
 * 文件名   : LoaderCreator
 * 创建者   :  xct
 * 创建时间 :  2020/5/22 9:55
 * 描述     :  创建loader view
 */
public class LoaderCreator {

    private static final WeakHashMap<String, Indicator> LOADING_MAP = new WeakHashMap<>();

    public static AVLoadingIndicatorView create(String type, Context context) {

        final AVLoadingIndicatorView avLoadingIndicatorView = new AVLoadingIndicatorView(context);
        Indicator typeIndicator = LOADING_MAP.get(type);
        if (typeIndicator == null) {
            typeIndicator = getIndicator(type);
            LOADING_MAP.put(type, typeIndicator);
        }
        avLoadingIndicatorView.setIndicator(typeIndicator);

        return avLoadingIndicatorView;

    }

    private static Indicator getIndicator(String name) {
        if (name == null || name.isEmpty()) {
            return null;
        }
        final StringBuilder drawableClassName = new StringBuilder();
        if (!name.contains(".")) {
            final String defaultPackageName = AVLoadingIndicatorView.class.getPackage().getName();
            drawableClassName.append(defaultPackageName)
                    .append(".Indicator.")
                    .append(name);
        }

        try {
            final Class<?> indicatorClass = Class.forName(drawableClassName.toString());
            return (Indicator) indicatorClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
