package com.thai.kmutt.thaitone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import com.thai.kmutt.thaitone.mApdater.LearnByAnimalAdapter;
import com.thai.kmutt.thaitone.mApdater.LearnByNumberAdapter;
import com.thai.kmutt.thaitone.mData.LearnByAnimal;
import com.thai.kmutt.thaitone.mData.LearnByAnimalCollection;
import com.thai.kmutt.thaitone.mData.LearnByNumberCollection;

public class LearnByAnimalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.learn_by_animal_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ListView lv = (ListView) findViewById(R.id.lv);
        LearnByAnimalAdapter adapter = new LearnByAnimalAdapter(this, LearnByAnimalCollection.getLernByAnimal());
        lv.setAdapter(adapter);

    }
}
