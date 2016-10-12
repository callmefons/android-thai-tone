package com.thai.kmutt.thaitone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import com.thai.kmutt.thaitone.mData.ThaiToneCollection;
import com.thai.kmutt.thaitone.mApdater.LearnEachThaiAdapter;

public class LearnEachThaiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.learning_each_thai_activity_main);

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
        LearnEachThaiAdapter adapter = new LearnEachThaiAdapter(this, ThaiToneCollection.getThaiTone());
        lv.setAdapter(adapter);
    }
}
