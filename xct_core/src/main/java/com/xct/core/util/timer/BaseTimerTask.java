package com.xct.core.util.timer;

import java.util.TimerTask;

/**
 * 项目名   : xct-WanAndroid
 * 包名     : com.xct.core.util.timer
 * 文件名   : BaseTimerTask
 * 创建者   :  xct
 * 创建时间 :  2020/5/21 8:57
 * 描述     :  TODO
 */
public class BaseTimerTask extends TimerTask {

    private ITimerTaskLister mITimerTaskLister;

    public BaseTimerTask(ITimerTaskLister mITimerTaskLister) {
        this.mITimerTaskLister = mITimerTaskLister;
    }

    @Override
    public void run() {
        if (mITimerTaskLister != null) {
            mITimerTaskLister.onTimer();
        }
    }
}
