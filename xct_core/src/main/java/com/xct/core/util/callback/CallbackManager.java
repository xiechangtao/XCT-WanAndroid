package com.xct.core.util.callback;

import java.util.WeakHashMap;

/**
 * 项目名   : xct-WanAndroid
 * 包名     : com.xct.core.util.callback
 * 文件名   : CallbackManager
 * 创建者   :  xct
 * 创建时间 :  2020/5/30 17:29
 * 描述     :  TODO
 */
public class CallbackManager {

    private static final WeakHashMap<Object, IGlobalCallback> CALLBACKS = new WeakHashMap<>();

    private static class Holder {
        private static final CallbackManager INSTANCE = new CallbackManager();
    }

    public static CallbackManager getInstance() {
        return Holder.INSTANCE;
    }


    public CallbackManager addCallback(Object tag, IGlobalCallback callback) {
        CALLBACKS.put(tag, callback);
        return this;
    }

    public IGlobalCallback getCallback(Object tag) {
        return CALLBACKS.get(tag);
    }

}
