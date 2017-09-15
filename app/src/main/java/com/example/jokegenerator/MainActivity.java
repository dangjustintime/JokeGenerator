package com.example.jokegenerator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity {

    private ImageView funnyFaceEmojiImageView;
    private LinearLayout mainActivityLinearLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //mainActivityLinearLayout = (LinearLayout) findViewById(R.id.linear_layout_main_activity);
        funnyFaceEmojiImageView = (ImageView) findViewById(R.id.image_view_funny_face_emoji);

        funnyFaceEmojiImageView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, JokeActivity.class);
                startActivity(intent);
            }
        });

    }
}

/*
public void ChangeBackgroundColor(View v) {
    double randomNumber;
    randomNumber = Math.random();
    //change background color every time user opens app
    if(randomNumber >= 0.0 && randomNumber < 0.1) {
        v.setBackgroundColor(getResources().getColor(R.color.blue));
    } else if(randomNumber >= 0.1 && randomNumber < 0.2) {
        v.setBackgroundColor(getResources().getColor(R.color.cyan));
    } else if(randomNumber >= 0.2 && randomNumber < 0.3) {
        v.setBackgroundColor(getResources().getColor(R.color.deepPurple));
    } else if(randomNumber >= 0.3 && randomNumber < 0.4) {
        v.setBackgroundColor(getResources().getColor(R.color.green));
    } else if(randomNumber >= 0.4 && randomNumber < 0.5) {
        v.setBackgroundColor(getResources().getColor(R.color.lightBlue));
    } else if(randomNumber >= 0.5 && randomNumber < 0.6) {
        v.setBackgroundColor(getResources().getColor(R.color.orange));
    } else if(randomNumber >= 0.6 && randomNumber < 0.7) {
        v.setBackgroundColor(getResources().getColor(R.color.pink));
    } else if(randomNumber >= 0.7 && randomNumber < 0.8) {
        v.setBackgroundColor(getResources().getColor(R.color.purple));
    } else if(randomNumber >= 0.8 && randomNumber < 0.9) {
        v.setBackgroundColor(getResources().getColor(R.color.red));
    } else if(randomNumber >= 0.9 && randomNumber < 1.0) {
        v.setBackgroundColor(getResources().getColor(R.color.yellow));
    }
}
*/