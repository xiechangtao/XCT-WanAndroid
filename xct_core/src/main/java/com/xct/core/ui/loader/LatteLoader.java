package com.xct.core.ui.loader;

import android.content.Context;
import android.support.v7.app.AppCompatDialog;
import android.view.Gravity;
import android.view.Window;
import android.view.WindowManager;

import com.wang.avi.AVLoadingIndicatorView;
import com.xct.core.R;
import com.xct.core.util.dimen.ScreenUtils;

import java.util.ArrayList;

/**
 * 项目名   : xct-WanAndroid
 * 包名     : com.xct.core.ui.loader
 * 文件名   : LatteLoader
 * 创建者   :  xct
 * 创建时间 :  2020/5/22 9:56
 * 描述     :  进度条progress show
 */
public class LatteLoader {

    private static final int LOADER_SIZE_SCALE = 8;
    private static final int LOADER_OFFSET_SCALE = 10;

    private static ArrayList<AppCompatDialog> LOADERS = new ArrayList<>();

    private static final String DEFAULT_LOADER_STYLE = LoaderStyle.BallRotateIndicator.name();

     static void showLoader(Context context, String name) {
        if (context == null || name == null) {
            throw new NullPointerException("context or name not is null");
        }
        AppCompatDialog loaderDialog = new AppCompatDialog(context, R.style.dialog);

        AVLoadingIndicatorView avLoadingIndicatorView = LoaderCreator.create(name, context);
        loaderDialog.setContentView(avLoadingIndicatorView);

        int deviceWidth = ScreenUtils.getScreenWeight();
        int deviceHeight = ScreenUtils.getScreenWeight();
        Window dialogWindow = loaderDialog.getWindow();
        if (dialogWindow != null) {
            final WindowManager.LayoutParams lp = dialogWindow.getAttributes();
            lp.width = deviceWidth / LOADER_SIZE_SCALE;
            lp.height = deviceHeight / LOADER_SIZE_SCALE;
            lp.height = lp.height + deviceHeight / LOADER_OFFSET_SCALE;
            lp.gravity = Gravity.CENTER;
        }
        LOADERS.add(loaderDialog);
        loaderDialog.show();
    }


    /**
     * 多写重载，要暴露出去的接口多一点。给调用这灵活的调用
     *
     * @param context
     * @param type
     */
    public static void showLoader(Context context, Enum<LoaderStyle> type) {
        showLoader(context, type.name());
    }


    public static void showLoader(Context context) {
        showLoader(context, DEFAULT_LOADER_STYLE);

    }

    public static void dissmissLoader() {
        for (AppCompatDialog loader : LOADERS) {
            if (loader != null) {
                if (loader.isShowing()) {
                    loader.cancel();
                }
            }
        }
    }

}
