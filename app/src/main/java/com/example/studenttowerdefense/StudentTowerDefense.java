package com.example.studenttowerdefense;


import com.example.studenttowerdefense.nl.int6.studenttowerdefense.GameView;
import com.example.studenttowerdefense.nl.int6.studenttowerdefense.model.Game;
import com.example.studenttowerdefense.nl.int6.studenttowerdefense.model.GameBoard;

/**
 * Created by yang- on 28/05/2018.
 */

public class StudentTowerDefense extends Game{

    /** Reference to the main activity, so some labels can be updated. */
    private GameView activity;

    public StudentTowerDefense(GameView activity){
        //	Create	a	new	game	board	and	couple	it	to	this	game
        super(new StudentTowerDefenseBoard());


        // Store reference to the main activity
        // This is used to update the score label
        this.activity = activity;

        initNewGame();
    }

    /**
     * Starts a new game.
     * Resets the score and places all objects in the right place.
     */
    public void initNewGame() {
        GameBoard board = getGameBoard();
        board.removeAllObjects();

        // Redraw the game view
        board.updateView();
    }
}
