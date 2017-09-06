package com.example.jokegenerator;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;



/**
 * Created by Justin Dang on 9/1/2017.
 */
/*
    this class is responsible for creating, updating, and deleting the database
 */
public class FeedReaderDbHelper extends SQLiteOpenHelper {

    //if the schema of the database is changed, update the version number
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "jokes.db";

    //put SQL statement in one string
    //create table string
    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE" + FeedReaderContract.FeedEntry.TABLE_NAME +
            " (" + FeedReaderContract.FeedEntry.COLUMN_ID +
            " INTEGER PRIMARY KEY AUTOINCREMENT," + FeedReaderContract.FeedEntry.COLUMN_SETUP +
            " TEXT, " + FeedReaderContract.FeedEntry.COLUMN_PUNCHLINE +
            " TEXT)";
    //delete table string
    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS" + FeedReaderContract.FeedEntry.TABLE_NAME;

    //constructor
    public FeedReaderDbHelper(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public void onCreate(SQLiteDatabase db) {
        //creates database if not created with string
        db.execSQL(SQL_CREATE_ENTRIES);
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //this database is in cache, upgrading is deleting the old database and creating a new one
        //deletes database with string
        db.execSQL(SQL_DELETE_ENTRIES);
        onCreate(db);
    }

    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //reverts database to previous version
        onUpgrade(db, oldVersion, newVersion);
    }
}
