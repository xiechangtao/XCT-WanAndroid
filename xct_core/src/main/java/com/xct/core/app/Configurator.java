package com.xct.core.app;

/**
 * 项目名   : xct-WanAndroid
 * 包名     : com.xct.core.app
 * 文件名   : Configurator
 * 创建者   :  xct
 * 创建时间 :  2020/5/16 18:12
 * 描述     :  全局配置
 */
public class Configurator {


//    private Configurator{
//
//
//    }


    public static Configurator getInstance() {
        return Holder.INSTANCE;
    }


    private static class Holder {
        private static Configurator INSTANCE = new Configurator();
    }

}
