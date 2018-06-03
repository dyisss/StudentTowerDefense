package com.example.studenttowerdefense.nl.int6.studenttowerdefense.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.studenttowerdefense.R;

/**
 * Created by Kyle on 03-Jun-18.
 */

public class HighScoreLayoutView extends LinearLayout {
    private String name;

    private int score;

    public void setName(String name) {
        this.name = name;
        TextView lName = findViewById(R.id.hLayoutName);
        lName.setText(name);
    }

    public void setScore(int score) {
        this.score = score;
        TextView lScore = findViewById(R.id.hLayoutScore);
        lScore.setText(""+score);
    }



    public HighScoreLayoutView(Context context) {
        super(context);
    }

    public HighScoreLayoutView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public HighScoreLayoutView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
