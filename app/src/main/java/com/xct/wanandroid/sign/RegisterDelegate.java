package com.xct.wanandroid.sign;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatEditText;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;

import com.xct.wanandroid.R;
import com.xct.wanandroid.base.PrimaryDelegate;

import butterknife.BindView;

/**
 * 项目名   : xct-WanAndroid
 * 包名     : com.xct.wanandroid.sign
 * 文件名   : RegisterDelegate
 * 创建者   :  xct
 * 创建时间 :  2020/5/19 17:58
 * 描述     :  注册页面
 */
public class RegisterDelegate extends PrimaryDelegate {

    @BindView(R.id.sign_edit_account)
    AppCompatEditText mAccount;
    @BindView(R.id.sign_edit_password)
    AppCompatEditText mPassword;
    @BindView(R.id.sign_edit_password_again)
    AppCompatEditText mPasswordAgain;
    @BindView(R.id.sign_button_sign)
    AppCompatButton mSignButton;
    @BindView(R.id.sign_text_to_login)
    AppCompatTextView mToLoginText;


    @Override
    public Object setLayout() {
        return R.layout.delegate_sign_in;
    }

    @Override
    public void onBindView(@NonNull Bundle saveInstanceState, @NonNull View rootView) {

    }
}
