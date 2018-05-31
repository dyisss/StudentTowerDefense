package com.example.studenttowerdefense;


import com.example.studenttowerdefense.nl.int6.studenttowerdefense.model.Game;
import com.example.studenttowerdefense.nl.int6.studenttowerdefense.model.GameBoard;

/**
 * Created by yang- on 28/05/2018.
 */

public class StudentTowerDefense extends Game{

    /** Reference to the main activity, so some labels can be updated. */
    private MainActivity activity;

    public StudentTowerDefense(MainActivity activity){
        //	Create	a	new	game	board	and	couple	it	to	this	game
        super(new StudentTowerDefenseBoard());


        // Store reference to the main activity
        // This is used to update the score label
        this.activity = activity;
    }
}
