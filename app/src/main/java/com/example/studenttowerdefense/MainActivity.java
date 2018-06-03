package com.example.studenttowerdefense;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.studenttowerdefense.nl.int6.studenttowerdefense.GameView;
import com.example.studenttowerdefense.nl.int6.studenttowerdefense.model.GameBoard;
import com.example.studenttowerdefense.nl.int6.studenttowerdefense.view.HighScoreView;
import com.example.studenttowerdefense.nl.int6.studenttowerdefense.view.RuleView;
import com.example.studenttowerdefense.nl.int6.studenttowerdefense.view.SettingsView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void play(View view) {
        Intent intent = new Intent(this, GameView.class);
        startActivity(intent);
    }

    public void highscore(View view) {
        Intent intent = new Intent(this, HighScoreView.class);
        startActivity(intent);
    }

    public void settings(View view) {
        Intent intent = new Intent(this, SettingsView.class);
        startActivity(intent);
    }

    public void rules(View view) {
        Intent intent = new Intent(this, RuleView.class);
        startActivity(intent);
    }
}
