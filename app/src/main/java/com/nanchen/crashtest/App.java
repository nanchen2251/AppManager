package com.nanchen.crashtest;

import com.nanchen.crashmanager.CrashApplication;
import com.nanchen.crashmanager.UncaughtExceptionHandlerImpl;

/**
 * Author: nanchen
 * Email: liushilin520@foxmail.com
 * Date: 2017-07-21  14:35
 */

public class App extends CrashApplication {


    @Override
    public void onCreate() {
        super.onCreate();
        // 设置崩溃后自动重启 APP
        UncaughtExceptionHandlerImpl.getInstance().init(this, BuildConfig.DEBUG, true, 0, MainActivity.class);

        // 禁止重启
//        UncaughtExceptionHandlerImpl.getInstance().init(this,BuildConfig.DEBUG);
    }
}
