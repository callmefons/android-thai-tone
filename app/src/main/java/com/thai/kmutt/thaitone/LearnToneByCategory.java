package com.thai.kmutt.thaitone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.thai.kmutt.thaitone.mApdater.LearnByColorsAdapter;
import com.thai.kmutt.thaitone.mData.LearnByActions;
import com.thai.kmutt.thaitone.mData.LearnByThings;

public class LearnToneByCategory extends AppCompatActivity {

    Button btn_learn_cat_num,
            btn_learn_cat_anim,
            btn_learn_cat_thing,
            btn_learn_cat_color,
            btn_learn_cat_action;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.learn_tone_by_category);

        btn_learn_cat_num = (Button)findViewById(R.id.learn_cat_num);
        btn_learn_cat_anim = (Button)findViewById(R.id.learn_cat_anim);
        btn_learn_cat_thing = (Button)findViewById(R.id.learn_cat_thing);
        btn_learn_cat_color = (Button)findViewById(R.id.learn_cat_color);
        btn_learn_cat_action = (Button)findViewById(R.id.learn_cat_action);

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
