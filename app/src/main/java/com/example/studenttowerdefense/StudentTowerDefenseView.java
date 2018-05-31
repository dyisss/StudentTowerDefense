package com.example.studenttowerdefense;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;

import com.example.studenttowerdefense.nl.int6.studenttowerdefense.view.GameBoardView;

/**
 * Created by yang- on 29/05/2018.
 */

public class StudentTowerDefenseView extends GameBoardView{
    private static final String TAG = "GameView";

    /**
     * Constructor.
     */
    public StudentTowerDefenseView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initGameView();
    }

    /**
     * Constructor.
     */
    public StudentTowerDefenseView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        initGameView();
    }

    private void initGameView() {
        Log.d(TAG, "Loading all images");

        spriteCache.setContext(this.getContext());

        // Load the 'empty' cell bitmap
        spriteCache.loadTile("empty", R.drawable.cell);
    }
}
