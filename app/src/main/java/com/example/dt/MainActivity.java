package com.example.dt;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 1300;
    final static int WAIT_VALUE = 1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // This is Splash Screen
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                Intent mainIntent = new Intent(MainActivity.this, Main1.class);
//                startActivity(mainIntent);
//            }
//        }, SPLASH_TIME_OUT);


    }








}
