package com.example.dt;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;
import java.util.concurrent.Executors;

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

        loadQuestions(getApplicationContext());
        startTimer.start();

    }



    private CountDownTimer startTimer = new CountDownTimer(WAIT_VALUE, 1000) {
        @Override
        public void onTick(long millisUntilFinished) {
            //nothing to do
        }

        @Override
        public void onFinish() {
            Intent playIntent = new Intent(MainActivity.this, Main1.class);
            startActivity(playIntent);
            finish();
        }
    };


    private void loadQuestions(final Context myContext) {
        try {
            Executors.newSingleThreadScheduledExecutor().execute(new Runnable() {
                @Override
                public void run() {
                    final List<Question> questions = new QuestionCollector().fetchQuestions(myContext);
                    QuizDatabase.getAppInstance(myContext).clearAllTables();
                    QuizDatabase.getAppInstance(myContext).questionDao().insertAll(questions);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
