package com.example.studenttowerdefense.nl.int6.studenttowerdefense.DataProviders;

import com.example.studenttowerdefense.nl.int6.studenttowerdefense.GameUnits.HighScore;

import java.util.ArrayList;

/**
 * Created by Kyle on 03-Jun-18.
 */

public class HighScoreDataProvier {
    public static ArrayList<HighScore>highScoreslist;

    static{
        highScoreslist = new ArrayList<>();
        addScore("Kyle",9999);
    }

    public static void addScore(String name, int score){
        highScoreslist.add(new HighScore(name , score));
    }

}
