package com.example.project2uas;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class SQLHelper extends SQLiteOpenHelper{
    //Deklarasi nama Database
    private static final String DATABASE_NAME="kontak.db";
    private static final int DATABASE_VERSION=1;
    //Deklarasi nama tabel
    public static final String TABLE="data";
    //Deklarasi nama kolom tabel
    public static final String masukan ="nomor";
    public static final String name="nama";

    //Konstruktor Database
    public SQLHelper(Context context){
        super(context, DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "create table " + TABLE + "( _id"
                + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + masukan + " TEXT NOT NULL, "
                + name + " TEXT NOT NULL);";
        Log.d("Data", "onCreate: " + sql);
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }
}
