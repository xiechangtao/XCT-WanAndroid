package com.xct.wanandroid.launcher.banner;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.view.View;

import com.bigkoo.convenientbanner.holder.Holder;


/**
 * 项目名   : xct-WanAndroid
 * 包名     : com.xct.wanandroid.launcher.banner
 * 文件名   : GuideImageHolderView
 * 创建者   :  xct
 * 创建时间 :  2020/5/19 21:23
 * 描述     :  banner 库需要实现的imageHolderView
 */
public class GuideImageHolderView implements Holder<Integer> {

    private AppCompatImageView imageView;

    @Override
    public View createView(Context context) {
        imageView = new AppCompatImageView(context);
        imageView.setScaleType(AppCompatImageView.ScaleType.FIT_XY);
        return imageView;
    }

    @Override
    public void UpdateUI(Context context, int position, Integer data) {
        imageView.setImageResource(data);
    }
}
