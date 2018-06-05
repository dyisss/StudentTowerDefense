package com.example.studenttowerdefense.nl.int6.studenttowerdefense;


import android.os.Bundle;
import android.service.quicksettings.Tile;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.example.studenttowerdefense.R;
import com.example.studenttowerdefense.StudentTowerDefense;
import com.example.studenttowerdefense.StudentTowerDefenseView;
import com.example.studenttowerdefense.nl.int6.studenttowerdefense.model.GameBoard;

/**
 * Created by Kyle on 02-Jun-18.
 */

public class GameView extends AppCompatActivity {
    private StudentTowerDefense game;
    private StudentTowerDefenseView gameView;
    private TextView scoreLabel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_view);
        this.gameView = (StudentTowerDefenseView) findViewById(R.id.gbvGame);
        this.game = new StudentTowerDefense(this);
        GameBoard board = game.getGameBoard();
        gameView.setGameBoard(board);
        gameView.setFixedGridSize(board.getWidth(), board.getHeight());

        View root = gameView.getRootView();
        root.setBackgroundResource(R.drawable.saxion);

    }
}
