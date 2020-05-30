package com.xct.core.util.callback;

/**
 * 项目名   : xct-WanAndroid
 * 包名     : com.xct.core.util.callback
 * 文件名   : IGlobalCallback
 * 创建者   :  xct
 * 创建时间 :  2020/5/30 17:24
 * 描述     :  callback回调管理
 */
public interface IGlobalCallback<T> {

    void executeCallback(T args);

}
