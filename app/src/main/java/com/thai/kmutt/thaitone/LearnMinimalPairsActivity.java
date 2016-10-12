package com.thai.kmutt.thaitone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.thai.kmutt.thaitone.mDetail.LearnMinimalPairsHighActivity;
import com.thai.kmutt.thaitone.mDetail.LearnMinimalPairsLowActivity;
import com.thai.kmutt.thaitone.mDetail.LearnMinimalPairsMidActivity;

public class LearnMinimalPairsActivity extends AppCompatActivity {


    RelativeLayout btn_mid, btn_low, btn_high;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.learn_minimal_pairs);

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

        btn_mid = (RelativeLayout)findViewById(R.id.learn_minimal_pairs_mid);
        btn_low = (RelativeLayout)findViewById(R.id.learn_minimal_pairs_low);
        btn_high = (RelativeLayout)findViewById(R.id.learn_minimal_pairs_high);

        btn_mid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LearnMinimalPairsMidActivity.class);
                startActivity(intent);
            }
        });

        btn_low.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LearnMinimalPairsLowActivity.class);
                startActivity(intent);
            }
        });

        btn_high.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LearnMinimalPairsHighActivity.class);
                startActivity(intent);
            }
        });

    }
}
