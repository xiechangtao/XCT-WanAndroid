package com.xct.wanandroid.launcher.banner;

import com.bigkoo.convenientbanner.holder.CBViewHolderCreator;

/**
 * 项目名   : xct-WanAndroid
 * 包名     : com.xct.wanandroid.launcher.banner
 * 文件名   : GuideViewHoldCreator
 * 创建者   :  xct
 * 创建时间 :  2020/5/19 21:22
 * 描述     :  有接口就可能有回调。这里可以学习下这个库的这种泛型和实现接口的方式，从而拿到对象回调
 */
public class GuideViewHoldCreator implements CBViewHolderCreator<GuideImageHolderView> {
    @Override
    public GuideImageHolderView createHolder() {
        return new GuideImageHolderView();
    }
}
