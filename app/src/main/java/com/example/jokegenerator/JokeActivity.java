package com.example.jokegenerator;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.jokegenerator.model.Joke;

import java.util.List;
import java.util.Random;

public class JokeActivity extends AppCompatActivity {

    private TextView jokeTextView;
    private LinearLayout jokeActivityLinearLayout;
    private Random random;
    private int randomNumber;
    private MainActivity mainActivity;
    private List<Joke> jokes;
    private Joke dbJoke;

    //database variables
    FeedReaderDbHelper mDbHelper;
    SQLiteDatabase db;
    Context context;
    Cursor cursor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        jokeTextView = (TextView) findViewById(R.id.text_view_joke);
        jokeActivityLinearLayout = (LinearLayout) findViewById(R.id.linear_layout_joke_activity);
        jokeTextView.setText("Why did the chicken cross the road?");
        //create a MainActivity to use randomBackgroundColor()
        mainActivity = new MainActivity();

        //generate random number between 1-10
        random = new Random();
        randomNumber = random.nextInt(10) + 1;

        //generate random background color
        mainActivity.randomBackgroundColor(jokeActivityLinearLayout, randomNumber);

        /*
        //instantiate SQLiteOpenHelper to access database
        mDbHelper = new FeedReaderDbHelper(getBaseContext()
        );
        db = mDbHelper.getReadableDatabase();

        cursor = db.query(
                FeedReaderContract.FeedEntry.TABLE_NAME,    //table to query
                null,                                       //columns to return (null returns all columns)
                null,                                       //rows to return (null returns all rows)
                null,
                null,                                       //declare group rows (null for not grouped)
                null,                                       //declare which groups to include in the cursor (null if group rows is null)
                null                                        //order of rows, null for default sort order

        );

        jokes = new ArrayList<>();
        //store jokes from database into array
        while(cursor.moveToNext()) {
            //create Joke object with data from the database and add it to jokes list
            dbJoke = new Joke(
                    cursor.getInt(cursor.getColumnIndex(FeedReaderContract.FeedEntry.COLUMN_ID)),
                    cursor.getString(cursor.getColumnIndex(FeedReaderContract.FeedEntry.COLUMN_SETUP)),
                    cursor.getString(cursor.getColumnIndex(FeedReaderContract.FeedEntry.COLUMN_PUNCHLINE))
            );
            jokes.add(dbJoke);
        }
        cursor.close();
        */

        jokeTextView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                random = new Random();
                randomNumber = random.nextInt(10) + 1;
                mainActivity.randomBackgroundColor(jokeActivityLinearLayout, randomNumber);
                jokeTextView.setText("To get to the other side.");
            }
        });

    }
}
