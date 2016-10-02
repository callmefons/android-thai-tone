package com.thai.kmutt.thaitone.mDetail;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.thai.kmutt.thaitone.R;

public class LearnByActionsDetailActivity extends AppCompatActivity {

    TextView txtNameThai, txtNameEng, txtNumber;
    ImageView imgAction;

    ImageButton btn_sound;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.learn_by_actions_detail_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        txtNameThai = (TextView)findViewById(R.id.txtNameThai);
        txtNameEng = (TextView)findViewById(R.id.txtNameEng);
        imgAction = (ImageView) findViewById(R.id.imgActions);

        Intent i = this.getIntent();
        String name_thai = i.getExtras().getString("NAME_THAI_KEY");
        String name_eng = i.getExtras().getString("NAME_ENG_KEY");
        int img = i.getExtras().getInt("IMAGE_KEY");

        txtNameThai.setText(name_thai);
        txtNameEng.setText(name_eng);
        imgAction.setImageResource(img);

//        final int sound = i.getExtras().getInt("SOUND_KEY");
//        mp = MediaPlayer.create(this, sound);
//
//        btn_sound.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mp.start();
//            }
//        });


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
