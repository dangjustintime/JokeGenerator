package com.example.jokegenerator;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.jokegenerator.model.Joke;

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

    //put SQL statements in one string
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

    //add new row to database
    public void addJoke(Joke joke) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(FeedReaderContract.FeedEntry.COLUMN_ID, joke.getId());
        values.put(FeedReaderContract.FeedEntry.COLUMN_SETUP, joke.getSetup());
        values.put(FeedReaderContract.FeedEntry.COLUMN_PUNCHLINE, joke.getPunchLine());
        db.insert(FeedReaderContract.FeedEntry.TABLE_NAME, null, values);
        db.close();
    }

    //remove row from database
    public void removeJoke(int jokeID) {
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("DELETE FROM " + FeedReaderContract.FeedEntry.TABLE_NAME +
                " WHERE " + FeedReaderContract.FeedEntry.COLUMN_ID +
                " = " + jokeID + ";");
    }

    //print database to a string
    public String databaseToString() {
        String dbString = "";
        SQLiteDatabase db = getWritableDatabase();
        String query = "SELECT * FROM " + FeedReaderContract.FeedEntry.TABLE_NAME + ";";
        //create cursor for database query
        Cursor c = db.rawQuery(query, null);
        //move to first row in database query
        c.moveToFirst();

        //stops while loop when there's no next row to go to
        while(!c.isAfterLast()) {
            dbString += c.getString(c.getColumnIndex(FeedReaderContract.FeedEntry.COLUMN_SETUP));
            dbString += "\n";
            dbString += c.getString(c.getColumnIndex(FeedReaderContract.FeedEntry.COLUMN_PUNCHLINE));
            dbString += "\n\n";
        }
        db.close();
        return dbString;
    }

}
