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

public class VowelsPracticeDetailActivity extends AppCompatActivity {

    TextView nameTxt;
    ImageButton btn_sound;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vowels_practice_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        nameTxt= (TextView)findViewById(R.id.nameTxt);
        btn_sound = (ImageButton)findViewById(R.id.btn_sound);
        Intent i = this.getIntent();
        int name = i.getExtras().getInt("NAME_KEY");
        final int sound = i.getExtras().getInt("SOUND_KEY");
        mp = MediaPlayer.create(this, sound);
        nameTxt.setText(name);
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
