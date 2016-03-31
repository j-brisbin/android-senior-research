package com.example.haungsn.finalprojectapi15;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by jbrisbin32 on 2/16/16.
 */
public class TriviaGameDBManager extends SQLiteOpenHelper{
    public static final String TG_TABLE_NAME = "memorygame";
    public static final String TG_ID = "_id";
    public static final String TG_QUESTION = "question";
    public static final String TG_QUESTION_TYPE = "question_type";
    public static final String TG_CORRECTANSWER = "correct_answer";

    public TriviaGameDBManager(Context context){
        super(context,
                /*db name=*/ "triviagamedb",
                /*cursorFactory=*/ null,
                /*db version=*/1);

    }
    @Override
    public void onCreate(SQLiteDatabase db){
        Log.d("db", "onCreate");
        String sql = "CREATE TABLE " + TG_TABLE_NAME
                + " (" + TG_ID + " INTEGER, "
                + TG_QUESTION + " TEXT,"
                + TG_QUESTION_TYPE + " TEXT,"
                + TG_CORRECTANSWER + " TEXT,"
                + " PRIMARY KEY (" + TG_ID + "));";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS " + TG_TABLE_NAME);
        onCreate(db);
    }
}
