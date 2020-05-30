package com.xct.core.net;

import com.xct.core.net.callback.IRequest;
import com.xct.core.net.callback.ISuccess;

import java.util.WeakHashMap;

/**
 * 项目名   : xct-WanAndroid
 * 包名     : com.xct.core.net
 * 文件名   : RestClientBuilder
 * 创建者   :  xct
 * 创建时间 :  2020/5/30 17:36
 * 描述     :  TODO
 */
public final class RestClientBuilder {

    private static final WeakHashMap<String, Object> PARAMS = RestCreator.getParams();
    private String mUrl = null;
    private IRequest mIRequest = null;
    private ISuccess mISuccess = null;

}
