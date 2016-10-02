package com.thai.kmutt.thaitone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import com.thai.kmutt.thaitone.mApdater.LearnByNumberAdapter;
import com.thai.kmutt.thaitone.mApdater.VowelPracticeAdapter;
import com.thai.kmutt.thaitone.mData.LearnByNumberCollection;
import com.thai.kmutt.thaitone.mData.VowelsCollection;

public class LearnByNumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.learn_by_number_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ListView lv = (ListView) findViewById(R.id.lv);
        LearnByNumberAdapter adapter = new LearnByNumberAdapter(this, LearnByNumberCollection.getLernByNumber());
        lv.setAdapter(adapter);
    }
}
