package com.example.studenttowerdefense.nl.int6.studenttowerdefense.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.studenttowerdefense.R;
import com.example.studenttowerdefense.nl.int6.studenttowerdefense.Adapters.HighScoreAdapter;
import com.example.studenttowerdefense.nl.int6.studenttowerdefense.DataProviders.HighScoreDataProvier;
import com.example.studenttowerdefense.nl.int6.studenttowerdefense.GameUnits.HighScore;

import java.util.List;

import static com.example.studenttowerdefense.nl.int6.studenttowerdefense.DataProviders.HighScoreDataProvier.highScoreslist;

/**
 * Created by Kyle on 03-Jun-18.
 */

public class HighScoreView extends AppCompatActivity {
    private ListView highScoreList;
    private HighScoreAdapter highScoreAdapter;
    private List<HighScore>highScores = HighScoreDataProvier.highScoreslist;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_highscores);

        highScoreAdapter = new HighScoreAdapter(this,android.R.layout.simple_list_item_1, highScores);
        highScoreList = findViewById(R.id.highScoresList);
        highScoreList.setAdapter(highScoreAdapter);
    }
}
