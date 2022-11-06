package com.example.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHandler extends SQLiteOpenHelper {
    public DatabaseHandler(Context context) {
        super(context, "tmudb", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE CCSIT (UID INT PRIMARY KEY,NAME VARCHAR(20))");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS CCSIT");
        onCreate(db);
    }

    public long insertData(CCSIT obj){
        SQLiteDatabase db = getWritableDatabase();
        ContentValues conv = new ContentValues();
        conv.put("UID",obj.getUid());
        conv.put("NAME",obj.getName());
        long count = db.insert("CCSIT",null,conv);
        db.close();
        return count;

    }
}
