package com.thai.kmutt.thaitone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import com.thai.kmutt.thaitone.mApdater.LearnByActionsAdapter;
import com.thai.kmutt.thaitone.mApdater.LearnByAnimalAdapter;
import com.thai.kmutt.thaitone.mData.LearnByActionsCollection;
import com.thai.kmutt.thaitone.mData.LearnByAnimalCollection;

public class LearnByActionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.learn_by_actions_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ListView lv = (ListView) findViewById(R.id.lv);
        LearnByActionsAdapter adapter = new LearnByActionsAdapter(this, LearnByActionsCollection.getLernByActions());
        lv.setAdapter(adapter);
    }
}
