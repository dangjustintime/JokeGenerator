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

        //ChangeBackgroundColor(mainActivityLinearLayout);

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
    Random random = new Random();
    int number = random.nextInt(10) + 1;
    //change background color every time user opens app
    if(number == 1) {
        v.setBackgroundColor(getResources().getColor(R.color.blue));
    } else if(number == 2) {
        v.setBackgroundColor(getResources().getColor(R.color.cyan));
    } else if(number == 3) {
        v.setBackgroundColor(getResources().getColor(R.color.deepPurple));
    } else if(number == 4) {
        v.setBackgroundColor(getResources().getColor(R.color.green));
    } else if(number == 5) {
        v.setBackgroundColor(getResources().getColor(R.color.lightBlue));
    } else if(number == 6) {
        v.setBackgroundColor(getResources().getColor(R.color.orange));
    } else if(number == 7) {
        v.setBackgroundColor(getResources().getColor(R.color.pink));
    } else if(number == 8) {
        v.setBackgroundColor(getResources().getColor(R.color.purple));
    } else if(number == 9) {
        v.setBackgroundColor(getResources().getColor(R.color.red));
    } else if(number == 10) {
        v.setBackgroundColor(getResources().getColor(R.color.yellow));
    }
}
*/