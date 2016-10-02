package com.thai.kmutt.thaitone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.thai.kmutt.thaitone.mData.ThaiToneCollection;
import com.thai.kmutt.thaitone.mApdater.LearnEachThaiAdapter;

public class LearnEachThaiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.learning_each_thai_activity_main);

        ListView lv = (ListView) findViewById(R.id.lv);
        LearnEachThaiAdapter adapter = new LearnEachThaiAdapter(this, ThaiToneCollection.getThaiTone());
        lv.setAdapter(adapter);
    }
}
