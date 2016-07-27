package com.yjc.mvptest;

import android.app.Application;
import android.util.Log;

import com.yjc.mvptest.db.DBinstance;

/**
 * Created by YJC on 2016/7/23.
 */
public class MyApplication extends Application{

    @Override
    public void onCreate(){
        super.onCreate();
        DBinstance.DBOpenHelperHolder.register(getApplicationContext());
        Log.i("application","ing");
    }
}
