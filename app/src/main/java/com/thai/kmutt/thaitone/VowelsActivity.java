package com.thai.kmutt.thaitone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.thai.kmutt.thaitone.mDetail.VowelsDetailActivity;
import com.thai.kmutt.thaitone.mDetail.VowelsPracticeListActivity;

public class VowelsActivity extends AppCompatActivity {

    Button  btn_next_vowels, btn_next_vowels_practice;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from viewpager_main.xml
        setContentView(R.layout.vowels_acitivity);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        toolbar.setContentInsetsAbsolute(0, 0);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        btn_next_vowels = (Button)findViewById(R.id.btn_next_vowels);
        btn_next_vowels_practice = (Button)findViewById(R.id.btn_next_vowels_practice);


        btn_next_vowels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VowelsActivity.this, VowelsDetailActivity.class);
                startActivity(intent);
            }
        });

        btn_next_vowels_practice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VowelsActivity.this, VowelsPracticeListActivity.class);
                startActivity(intent);
            }
        });



    }

}

