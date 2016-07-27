package com.yjc.mvptest.db;

import android.content.Context;

/**
 * Created by YJC on 2016/7/23.
 */
public class DBinstance {
    public static class DBOpenHelperHolder{
        private static DBOpenHelper dbOpenHelper;
        public static void register(Context context){
            dbOpenHelper=new DBOpenHelper(context);
        }
    }
    public static DBOpenHelper getInstance(){
        return DBOpenHelperHolder.dbOpenHelper;
    }




}
