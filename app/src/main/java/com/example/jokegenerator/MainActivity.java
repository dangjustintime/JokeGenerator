package com.example.jokegenerator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private double randomNumber;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        randomNumber = Math.random();
        //change background color every time user opens app
        if(randomNumber >= 0.0 && randomNumber < 0.1) {

        } else if(randomNumber >= 0.1 && randomNumber < 0.2) {

        } else if(randomNumber >= 0.2 && randomNumber < 0.3) {

        } else if(randomNumber >= 0.3 && randomNumber < 0.4) {

        } else if(randomNumber >= 0.4 && randomNumber < 0.5) {

        } else if(randomNumber >= 0.5 && randomNumber < 0.6) {

        } else if(randomNumber >= 0.6 && randomNumber < 0.7) {

        } else if(randomNumber >= 0.7 && randomNumber < 0.8) {

        } else if(randomNumber >= 0.8 && randomNumber < 0.9) {

        } else if(randomNumber >= 0.9 && randomNumber < 1.0) {

        }

    }
}
