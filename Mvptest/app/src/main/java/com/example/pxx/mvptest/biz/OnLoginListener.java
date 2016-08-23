package com.example.pxx.mvptest.biz;


import com.example.pxx.mvptest.bean.User;

/**
 * Created by zhy on 15/6/19.
 */
public interface OnLoginListener
{
    void loginSuccess(User user);

    void loginFailed();
}
