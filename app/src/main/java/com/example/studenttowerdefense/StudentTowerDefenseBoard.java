package com.example.studenttowerdefense;

import com.example.studenttowerdefense.nl.int6.studenttowerdefense.model.GameBoard;

/**
 * Created by yang- on 28/05/2018.
 */

public class StudentTowerDefenseBoard extends GameBoard {
    private static final int GAMEBOARD_WIDTH = 10;
    private static final int GAMEBOARD_HEIGHT = 12;

    /**
     * Create a new game board.
     */
    public StudentTowerDefenseBoard() {
        super(GAMEBOARD_WIDTH, GAMEBOARD_HEIGHT);
    }

    @Override
    public void onEmptyTileClicked(int x, int y) {
        // Nothing to do in this game.
    }

    @Override
    public String getBackgroundImg(int mx, int my) {
        return "empty";
    }
}
