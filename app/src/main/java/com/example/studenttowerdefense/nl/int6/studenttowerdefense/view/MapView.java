package com.example.studenttowerdefense.nl.int6.studenttowerdefense.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.studenttowerdefense.R;
import com.example.studenttowerdefense.nl.int6.studenttowerdefense.GameView;

/**
 * Created by Kyle on 05-Jun-18.
 */

public class MapView extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
    }

    public void confirm(View view) {
        Intent intent = new Intent(this, GameView.class);
        startActivity(intent);
    }
}
