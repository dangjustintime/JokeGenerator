package com.example.jokegenerator;

import android.provider.BaseColumns;

/**
 * Created by Justin Dang on 8/31/2017.
 */

//this class is used to define the table name and column names of the database

public class FeedReaderContract {
    //constructor must be private so that its not accidentally used
    private FeedReaderContract() {}

    //this class has the table and column names
    public static class FeedEntry implements BaseColumns {
        public static final String TABLE_NAME = "jokes";
        public static final String COLUMN_ID = "id";
        public static final String COLUMN_SETUP = "setup";
        public static final String COLUMN_PUNCHLINE = "punchline";
    }
}
