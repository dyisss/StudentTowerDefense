package com.example.studenttowerdefense.nl.int6.studenttowerdefense.GameUnits;

import android.util.Log;

import com.example.studenttowerdefense.nl.int6.studenttowerdefense.model.Game;
import com.example.studenttowerdefense.nl.int6.studenttowerdefense.model.GameBoard;
import com.example.studenttowerdefense.nl.int6.studenttowerdefense.model.GameObject;

/**
 * Created by Kyle on 03-Jun-18.
 */

public class Enemy extends GameObject {
    public static final String ENEMY_IMAGE="";

    public Enemy(int x , int y , int width , int height  , float speed){

    }

    @Override
    public String getImageId() {
        return ENEMY_IMAGE;
    }

    @Override
    public void onTouched(GameBoard gameBoard) {
        Log.d(Game.TAG,"Touched Tower");

        //When a Tower is touched

        //implement check if position if over colliding with other objects

        //redraw app
        gameBoard.updateView();
    }

}
