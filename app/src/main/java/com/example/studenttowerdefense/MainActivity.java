package com.example.studenttowerdefense;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.studenttowerdefense.nl.int6.studenttowerdefense.model.GameBoard;

public class MainActivity extends AppCompatActivity {
    private StudentTowerDefense game;
    private StudentTowerDefenseView gameView;
    private TextView scoreLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        this.gameView = (StudentTowerDefenseView) findViewById(R.id.gbvGame);
        this.game = new StudentTowerDefense(this);

        GameBoard board = game.getGameBoard();
        gameView.setGameBoard(board);
        gameView.setFixedGridSize(board.getWidth(), board.getHeight());
    }
}
