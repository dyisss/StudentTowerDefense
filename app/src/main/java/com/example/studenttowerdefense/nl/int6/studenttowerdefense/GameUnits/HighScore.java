package com.example.studenttowerdefense.nl.int6.studenttowerdefense.GameUnits;

/**
 * Created by Kyle on 03-Jun-18.
 */

public class HighScore {
    private String name;
    private int score;

    public HighScore(String name , int score){
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
