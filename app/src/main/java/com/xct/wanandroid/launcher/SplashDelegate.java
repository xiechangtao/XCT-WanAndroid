package com.xct.wanandroid.launcher;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;

import com.xct.core.util.storage.SharePreUtils;
import com.xct.core.util.timer.BaseTimerTask;
import com.xct.core.util.timer.ITimerTaskLister;
import com.xct.wanandroid.Constant;
import com.xct.wanandroid.R;
import com.xct.wanandroid.base.PrimaryDelegate;

import java.text.MessageFormat;
import java.util.Timer;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * 项目名   : xct-WanAndroid
 * 包名     : com.xct.wanandroid.launcher
 * 文件名   : SplashDelegate
 * 创建者   :  xct
 * 创建时间 :  2020/5/19 17:52
 * 描述     :  闪屏页广告fragment,app 第一个页面
 */
public class SplashDelegate extends PrimaryDelegate implements ITimerTaskLister {

    @BindView(R.id.app_tv_timer)
    AppCompatTextView mTVTimer = null;

    private int mCount = 5;

    private Timer mTimer;

    @OnClick(R.id.app_tv_timer)
    void onClickTimerView() {
        if (mTimer != null) {
            mTimer.cancel();
            mTimer = null;
            checkIsLauncher();
        }
    }

    private void initTimer() {
        mTimer = new Timer();
        BaseTimerTask baseTimerTask = new BaseTimerTask(this);
        mTimer.schedule(baseTimerTask, 0, 1000);
    }

    @Override
    public Object setLayout() {
        return R.layout.delegate_splash;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onBindView(@NonNull Bundle saveInstanceState, @NonNull View rootView) {
        initTimer();
    }

    private void checkIsLauncher() {
        if (!SharePreUtils.getAppFlag(Constant.ISFIRSTLAUNCHER)) {
            getSupportDelegate().startWithPop(new GuideDelegate());
        } else {

        }
    }

    @Override
    public void onTimer() {
        getProxyActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if (mTimer != null) {
                    mTVTimer.setText(MessageFormat.format("跳过\n{0}s", mCount));
                    mCount--;
                    if (mCount < 0) {
                        mTimer.cancel();
                        mTimer = null;
                        checkIsLauncher();
                    }
                }
            }
        });


    }
}
