package com.thai.kmutt.thaitone.mDetail;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.thai.kmutt.thaitone.R;

public class LearnByNumberDetail extends AppCompatActivity {

    TextView txtNameThai, txtNameEng;
    ImageView imgNumber;

    ImageButton btn_sound;
    MediaPlayer mp;

    int sound, img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.learn_by_number_detail_main);
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


        txtNameThai = (TextView)findViewById(R.id.txtNameThai);
        txtNameEng = (TextView)findViewById(R.id.txtNameEng);
        imgNumber = (ImageView) findViewById(R.id.imgNumber);
        btn_sound = (ImageButton)findViewById(R.id.btn_sound);

        Intent i = this.getIntent();
        String name_thai = i.getExtras().getString("NAME_THAI_KEY");
        String name_eng = i.getExtras().getString("NAME_ENG_KEY");
        img = i.getExtras().getInt("IMAGE_KEY");
        sound = i .getExtras().getInt("SOUND_KEY");

        txtNameThai.setText(name_thai);
        txtNameEng.setText(name_eng);
        imgNumber.setImageResource(img);

        mp = MediaPlayer.create(this, sound);

        btn_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
