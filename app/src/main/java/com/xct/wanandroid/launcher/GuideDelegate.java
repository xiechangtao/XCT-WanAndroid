package com.xct.wanandroid.launcher;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;

import com.bigkoo.convenientbanner.ConvenientBanner;
import com.bigkoo.convenientbanner.listener.OnItemClickListener;
import com.xct.core.util.storage.SharePreUtils;
import com.xct.wanandroid.Constant;
import com.xct.wanandroid.R;
import com.xct.wanandroid.base.PrimaryDelegate;
import com.xct.wanandroid.launcher.banner.GuideViewHoldCreator;

import java.util.ArrayList;

/**
 * 项目名   : xct-WanAndroid
 * 包名     : com.xct.wanandroid.launcher
 * 文件名   : GuideDelegate
 * 创建者   :  xct
 * 创建时间 :  2020/5/19 17:52
 * 描述     :  新手引导页面，只展示一次
 */
public class GuideDelegate extends PrimaryDelegate implements OnItemClickListener {

    private ConvenientBanner<Integer> convenientBanner;
    private ArrayList<Integer> mImages = new ArrayList<>();


    @Override
    public Object setLayout() {
        convenientBanner = new ConvenientBanner<>(getContext());
        return convenientBanner;
    }

    @Override
    public void onBindView(@NonNull Bundle saveInstanceState, @NonNull View rootView) {
        initBanner();
    }


    private void initBanner() {
        mImages.add(R.mipmap.launcher_01);
        mImages.add(R.mipmap.launcher_02);
        mImages.add(R.mipmap.launcher_03);
        mImages.add(R.mipmap.launcher_04);
        mImages.add(R.mipmap.launcher_05);
        convenientBanner.setPages(new GuideViewHoldCreator(), mImages)
                .setPageIndicator(new int[]{R.drawable.dot_normal, R.drawable.dot_focus})
                .setPageIndicatorAlign(ConvenientBanner.PageIndicatorAlign.CENTER_HORIZONTAL)
                .setOnItemClickListener(this)
                .setCanLoop(false);
    }

    @Override
    public void onItemClick(int position) {
        if (position == mImages.size() - 1){
            SharePreUtils.setAppFlag(Constant.ISFIRSTLAUNCHER,true);

        }
    }
}
