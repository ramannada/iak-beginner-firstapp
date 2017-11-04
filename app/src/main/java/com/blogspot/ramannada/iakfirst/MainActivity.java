package com.blogspot.ramannada.iakfirst;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int scoreA;
    int scoreB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add3PointForA(View view) {
        scoreA += 3;
        displayScoreForA();

    }

    public void add2PointForA(View view) {
        scoreA += 2;
        displayScoreForA();
    }

    public void addFreeThrowPointForA(View view) {
        scoreA += 1;
        displayScoreForA();
    }

    public void add2PointForB(View view) {
        scoreB += 2;
        displayScoreForB();
    }

    public void add3PointForB(View view) {
        scoreB += 3;
        displayScoreForB();
    }

    public void addFreeThrowPointForB(View view) {
        scoreB += 1;
        displayScoreForB();
    }

    public void resetPoint(View view) {
        scoreA = 0;
        scoreB = 0;
        displayScoreForA();
        displayScoreForB();
    }

    public void displayScoreForA() {
        TextView textView = findViewById(R.id.tv_score_a);
        textView.setText(String.valueOf(scoreA));
    }

    public void displayScoreForB() {
        TextView textView = findViewById(R.id.tv_score_b);
        textView.setText(String.valueOf(scoreB));
    }
}
