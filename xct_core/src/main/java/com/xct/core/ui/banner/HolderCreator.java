package com.xct.core.ui.banner;

import com.bigkoo.convenientbanner.holder.CBViewHolderCreator;

/**
 * 项目名   : xct-WanAndroid
 * 包名     : com.xct.core.ui.banner
 * 文件名   : HolderCreator
 * 创建者   :  xct
 * 创建时间 :  2020/5/30 17:03
 * 描述     :  TODO
 */
public class HolderCreator implements CBViewHolderCreator<ImageHolder> {
    @Override
    public ImageHolder createHolder() {
        return new ImageHolder();
    }
}
