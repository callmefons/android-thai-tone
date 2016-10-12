package com.thai.kmutt.thaitone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
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

        toolbar.setContentInsetsAbsolute(0, 0);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        ListView lv = (ListView) findViewById(R.id.lv);
        LearnByNumberAdapter adapter = new LearnByNumberAdapter(this, LearnByNumberCollection.getLernByNumber());
        lv.setAdapter(adapter);
    }
}
