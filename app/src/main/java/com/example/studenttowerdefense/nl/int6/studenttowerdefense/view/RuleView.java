package com.example.studenttowerdefense.nl.int6.studenttowerdefense.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.studenttowerdefense.R;

import static com.example.studenttowerdefense.nl.int6.studenttowerdefense.DataProviders.RuleDataProvier.rulesArrayList;

/**
 * Created by Kyle on 03-Jun-18.
 */

public class RuleView extends AppCompatActivity {
    private ListView ruleList;
    private ArrayAdapter ruleAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rules);

        ruleAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,rulesArrayList);
        ruleList = findViewById(R.id.ruleList);
        ruleList.setAdapter(ruleAdapter);
    }
}
