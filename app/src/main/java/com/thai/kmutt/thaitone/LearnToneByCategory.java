package com.thai.kmutt.thaitone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.thai.kmutt.thaitone.mApdater.LearnByColorsAdapter;
import com.thai.kmutt.thaitone.mData.LearnByActions;
import com.thai.kmutt.thaitone.mData.LearnByThings;

public class LearnToneByCategory extends AppCompatActivity {

    RelativeLayout btn_learn_cat_num,
            btn_learn_cat_anim,
            btn_learn_cat_thing,
            btn_learn_cat_color,
            btn_learn_cat_action;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.learn_tone_by_category);

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

        btn_learn_cat_num = (RelativeLayout)findViewById(R.id.learn_cat_num);
        btn_learn_cat_anim = (RelativeLayout)findViewById(R.id.learn_cat_anim);
        btn_learn_cat_thing = (RelativeLayout)findViewById(R.id.learn_cat_thing);
        btn_learn_cat_color = (RelativeLayout)findViewById(R.id.learn_cat_color);
        btn_learn_cat_action = (RelativeLayout)findViewById(R.id.learn_cat_action);

        btn_learn_cat_num.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LearnByNumberActivity.class);
                startActivity(intent);
            }
        });

        btn_learn_cat_anim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LearnByAnimalActivity.class);
                startActivity(intent);
            }
        });

        btn_learn_cat_thing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LearnByThingsActivity.class);
                startActivity(intent);
            }
        });

        btn_learn_cat_color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LearnByColorsActivity.class);
                startActivity(intent);
            }
        });

        btn_learn_cat_action.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LearnByActionsActivity.class);
                startActivity(intent);
            }
        });



    }
}
