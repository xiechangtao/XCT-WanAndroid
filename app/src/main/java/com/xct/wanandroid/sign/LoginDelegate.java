package com.xct.wanandroid.sign;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.TextInputEditText;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;

import com.joanzapata.iconify.widget.IconTextView;
import com.xct.wanandroid.R;
import com.xct.wanandroid.base.PrimaryDelegate;

import butterknife.BindView;

/**
 * 项目名   : xct-WanAndroid
 * 包名     : com.xct.wanandroid.sign
 * 文件名   : LoginDelegate
 * 创建者   :  xct
 * 创建时间 :  2020/5/19 17:58
 * 描述     :  登录页面
 */

public class LoginDelegate extends PrimaryDelegate {

    @BindView(R.id.login_et_account)
    TextInputEditText mAccount ;

    @BindView(R.id.login_et_password)
    TextInputEditText mPassword ;

    @BindView(R.id.login_bt_login)
    AppCompatButton mLoginButton ;

    @BindView(R.id.login_tv_sign_in)
    AppCompatTextView mSingTextView ;

    @BindView(R.id.login_tv_we_chat)
    IconTextView mWeChatLogin;


    @Override
    public Object setLayout() {
        return R.layout.delegate_login;
    }

    @Override
    public void onBindView(@NonNull Bundle saveInstanceState, @NonNull View rootView) {

    }
}
