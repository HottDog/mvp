package com.yjc.mvptest.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by YJC on 2016/7/23.
 */
public class DBOpenHelper extends SQLiteOpenHelper {
    private static final String DATABASENAME = "test.db"; //数据库名称
    private static final int DATABASEVERSION = 1;//数据库版本,大于0

    public DBOpenHelper(Context context) {
        super(context, DATABASENAME, null, DATABASEVERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE user " +
                "(userid integer primary key autoincrement, firstname varchar(20),lastname varchar(20) )");//创建表 person
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
