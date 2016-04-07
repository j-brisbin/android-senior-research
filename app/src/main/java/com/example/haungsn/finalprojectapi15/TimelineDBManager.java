package com.example.haungsn.finalprojectapi15;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by jbrisbin32 on 2/16/16.
 */
public class TimelineDBManager extends SQLiteOpenHelper{
    public static final String TL_TABLE_NAME = "memorygame";
    public static final String TL_ID = "_id";
    public static final String TL_YEAR = "year";
    public static final String TL_NAME = "name";
    public static final String TL_DESCRIPTION = "description";

    public TimelineDBManager(Context context){
        super(context,
                /*db name=*/ "timelinedb",
                /*cursorFactory=*/ null,
                /*db version=*/1);

    }
    @Override
    public void onCreate(SQLiteDatabase db){
        Log.d("db", "onCreate");
        String sql = "CREATE TABLE " + TL_TABLE_NAME
                + " (" + TL_ID + " INTEGER, "
                + TL_NAME + " TEXT,"
                + TL_YEAR + " INTEGER,"
                + TL_DESCRIPTION + " TEXT,"
                + " PRIMARY KEY (" + TL_ID + "));";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS " + TL_TABLE_NAME);
        onCreate(db);
    }
}
