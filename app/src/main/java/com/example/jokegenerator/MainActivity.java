package com.example.jokegenerator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    private ImageView funnyFaceEmojiImageView;
    private LinearLayout mainActivityLinearLayout;
    private Random random;
    private int randomNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainActivityLinearLayout = (LinearLayout) findViewById(R.id.linear_layout_main_activity);
        funnyFaceEmojiImageView = (ImageView) findViewById(R.id.image_view_funny_face_emoji);
        random = new Random();
        randomNumber = random.nextInt(10) + 1;

        randomBackgroundColor(mainActivityLinearLayout, randomNumber);

        funnyFaceEmojiImageView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, JokeActivity.class);
                startActivity(intent);
            }
        });
    }

    public void randomBackgroundColor(View v, int randomNumber) {
        //change background color every time user opens app
        switch(randomNumber) {
            case 1:
                v.setBackgroundColor(v.getResources().getColor(R.color.blue));
                break;
            case 2:
                v.setBackgroundColor(v.getResources().getColor(R.color.cyan));
                break;
            case 3:
                v.setBackgroundColor(v.getResources().getColor(R.color.deepPurple));
                break;
            case 4:
                v.setBackgroundColor(v.getResources().getColor(R.color.green));
                break;
            case 5:
                v.setBackgroundColor(v.getResources().getColor(R.color.lightBlue));
                break;
            case 6:
                v.setBackgroundColor(v.getResources().getColor(R.color.orange));
                break;
            case 7:
                v.setBackgroundColor(v.getResources().getColor(R.color.pink));
                break;
            case 8:
                v.setBackgroundColor(v.getResources().getColor(R.color.purple));
                break;
            case 9:
                v.setBackgroundColor(v.getResources().getColor(R.color.red));
                break;
            case 10:
                v.setBackgroundColor(v.getResources().getColor(R.color.yellow));
                break;
        }
    }
}

