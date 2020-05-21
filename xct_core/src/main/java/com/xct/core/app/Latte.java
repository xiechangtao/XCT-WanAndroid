package com.xct.core.app;

import android.content.Context;
import android.os.Handler;

/**
 * 项目名   : xct-WanAndroid
 * 包名     : com.xct.core.app
 * 文件名   : Latte
 * 创建者   :  xct
 * 创建时间 :  2020/5/16 18:11
 * 描述     :  全局配置变量管理类(对外)
 */
public class Latte {


    public static Configurator init(Context context) {
        Configurator.getInstance()
                .getLatteConfigs()
                .put(ConfigKeys.APPLICATION_CONTEXT, context.getApplicationContext());
        return Configurator.getInstance();

    }

    public static Configurator getConfigurator() {
        return Configurator.getInstance();
    }

    public static <T> T getConfiguration(Object key) {
        return getConfigurator().getConfiguration(key);
    }

    public static Context getApplicationContext() {
        return getConfiguration(ConfigKeys.APPLICATION_CONTEXT);
    }

    public static Handler getHandler() {
        return getConfiguration(ConfigKeys.HANDLER);
    }

}
