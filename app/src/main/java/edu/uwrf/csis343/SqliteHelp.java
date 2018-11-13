package edu.uwrf.csis343;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SqliteHelp extends SQLiteOpenHelper {

    //private vs public
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "contacts.db";
    public static final String TABLE_NAME = "contacts";
    public static final String COLOUMN_ID = "ID";
    public static final String COLOUMN_USERNAME = "username"; // this is the email
    public static final String COLOUMN_PASSWORD = "pass"; // password
    public static final String COLOUMN_FirstName = "FirstName";
    public static final String COLOUMN_LastName = "LastName";
    public static final String COLOUMN_HEIGHT = "height"; // in inches
    public static final String COLOUMN_WEIGHT = "weight"; // in pounds
    public static final String COLOUMN_PHONE = "phone";

    SQLiteDatabase db;


    public SqliteHelp(Context context){
        super(context, DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
       // db.execSQL("CREATE TABLE" + TABLE_NAME+ "(ID INTEGER PRIMARY KEY AUTO INCREMENT, )");

        db.execSQL("CREATE TABLE " + TABLE_NAME + "(ID INTEGER PRIMARY KEY AUTOINCREMENT,FirstName TEXT,"
                +"LastName TEXT, pass TEXT,phone TEXT,username TEXT, weight TEXT, height TEXT)");
        this.db = db;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String query = "DROP TABLE IF EXISTS " + TABLE_NAME; // drop older table if it exist
        db.execSQL(query);
        this.onCreate(db);
    }
}
