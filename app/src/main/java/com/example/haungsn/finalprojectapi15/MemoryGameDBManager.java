package com.example.haungsn.finalprojectapi15;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by jbrisbin32 on 2/16/16.
 */
public class MemoryGameDBManager extends SQLiteOpenHelper{
    public static final String MG_TABLE_NAME = "memorygame";
    public static final String MG_ID = "_id";
    public static final String MG_NAME = "name";
    public static final String MG_DESCRIPTION = "description";
    public static final String MG_PICTUREPATH = "picture_path";

    public MemoryGameDBManager(Context context){
        super(context,
                /*db name=*/ "memorygamedb",
                /*cursorFactory=*/ null,
                /*db version=*/1);

    }
    @Override
    public void onCreate(SQLiteDatabase db){
        Log.d("db", "onCreate");
        String sql = "CREATE TABLE " + MG_TABLE_NAME
                + " (" + MG_ID + " INTEGER, "
                + MG_NAME + " TEXT,"
                + MG_DESCRIPTION + " TEXT,"
                + MG_PICTUREPATH + " TEXT,"
                + " PRIMARY KEY (" + MG_ID + "));";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS " + MG_TABLE_NAME);
        onCreate(db);
    }
}
