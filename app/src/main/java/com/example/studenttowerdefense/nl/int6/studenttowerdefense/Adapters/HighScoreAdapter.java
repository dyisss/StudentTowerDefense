package com.example.studenttowerdefense.nl.int6.studenttowerdefense.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.example.studenttowerdefense.R;
import com.example.studenttowerdefense.nl.int6.studenttowerdefense.GameUnits.HighScore;
import com.example.studenttowerdefense.nl.int6.studenttowerdefense.view.HighScoreLayoutView;

import java.util.List;

/**
 * Created by Kyle on 03-Jun-18.
 */

public class HighScoreAdapter extends ArrayAdapter<HighScore> {
    List<HighScore> mHighScores;
    LayoutInflater mInflater;

    public HighScoreAdapter(@NonNull Context context, int resource, @NonNull List<HighScore> objects) {
        super(context, resource, objects);
        this.mHighScores = objects;
        this.mInflater= LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null){
            convertView = mInflater.inflate(R.layout.highscorelayout,parent,false);
        }
        HighScore highScore = mHighScores.get(position);
        HighScoreLayoutView view = (HighScoreLayoutView) convertView.findViewById(R.id.HighScoreView);
        view.setName(view.getName());
        view.setScore(view.getScore());

        return convertView;
    }
}
