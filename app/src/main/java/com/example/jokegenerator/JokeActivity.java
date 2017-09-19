package com.example.jokegenerator;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    TextView jokeTextView;
    LinearLayout jokeActivityLinearLayout;


    FeedReaderDbHelper mDbHelper;
    SQLiteDatabase db;
    String[] projection;
    String selection;
    String selectionArgs;
    String sortOrder;
    Cursor cursor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        jokeTextView = (TextView) findViewById(R.id.text_view_joke);
        jokeActivityLinearLayout = (LinearLayout) findViewById(R.id.linear_layout_joke_activity);
        jokeTextView.setText("Why did the chicken cross the road?");



        jokeTextView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                jokeActivityLinearLayout.setBackgroundColor(getResources().getColor(R.color.green));
                jokeTextView.setText("To get to the other side.");
            }
        });

        /*
        //instantiate FeedReaderDbHelper
        FeedReaderDbHelper mDbHelper = new FeedReaderDbHelper(getApplicationContext());

        SQLiteDatabase db = mDbHelper.getReadableDatabase();

        //specifiy which columns from the database you are using
        String[] projection =  {
                FeedReaderContract.FeedEntry.COLUMN_SETUP,
                FeedReaderContract.FeedEntry.COLUMN_PUNCHLINE
        };
        */
        /*
        Cursor cursor = db.query(
                FeedReaderContract.FeedEntry.TABLE_NAME,    //table name
                projection,     //selected columns to display
                null,       //selected rows, null == show all rows
                null,       //order of rows displayed
                null,       //row groups
                null,       //which row groups to include, null == show all row groups
                null        //sort order
        );
        */


    }
}
