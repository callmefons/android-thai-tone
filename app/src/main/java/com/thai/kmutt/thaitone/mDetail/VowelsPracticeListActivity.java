package com.thai.kmutt.thaitone.mDetail;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import com.thai.kmutt.thaitone.R;
import com.thai.kmutt.thaitone.mApdater.LearnEachThaiAdapter;
import com.thai.kmutt.thaitone.mApdater.VowelPracticeAdapter;
import com.thai.kmutt.thaitone.mData.ThaiToneCollection;
import com.thai.kmutt.thaitone.mData.VowelsCollection;

public class VowelsPracticeListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vowels_practice_main);
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
        VowelPracticeAdapter adapter = new VowelPracticeAdapter(this, VowelsCollection.getVowels());
        lv.setAdapter(adapter);

    }

}
