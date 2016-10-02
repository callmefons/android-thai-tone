package com.thai.kmutt.thaitone.mDetail;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.thai.kmutt.thaitone.ConsonantsActivity;
import com.thai.kmutt.thaitone.R;

/**
 * Created by 006075 on 2/10/2559.
 */

public class ConsonantsDetailActivity extends AppCompatActivity {

    int[] txt, txtWord;
    int[] img;
    int[] sound;

    TextView textView, texttWord, textTitle;
    ImageButton btn_sound;
    Button btn_back, btn_next;
    MediaPlayer mp;
    RelativeLayout btn_control;
    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.consonants_content);
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

        position = 0;
        // Generate sample data
        sound = new int[]{
                R.raw.pa,
                R.raw.pha,
                R.raw.ba,
                R.raw.ta,
                R.raw.th,
                R.raw.da,
                R.raw.kh,
                R.raw.ka,
                R.raw.ca,
                R.raw.a,
                R.raw.cha,
                R.raw.fa,
                R.raw.ha,
                R.raw.ma,
                R.raw.na,
                R.raw.ngaa,
                R.raw.la,
                R.raw.ra,
                R.raw.sa,
                R.raw.wa,
                R.raw.ja,
        };

        txtWord = new int[]{
                R.string.word_consonants01,
                R.string.word_consonants02,
                R.string.word_consonants03,
                R.string.word_consonants04,
                R.string.word_consonants05,
                R.string.word_consonants06,
                R.string.word_consonants07,
                R.string.word_consonants08,
                R.string.word_consonants09,
                R.string.word_consonants10,
                R.string.word_consonants11,
                R.string.word_consonants12,
                R.string.word_consonants13,
                R.string.word_consonants14,
                R.string.word_consonants15,
                R.string.word_consonants16,
                R.string.word_consonants17,
                R.string.word_consonants18,
                R.string.word_consonants19,
                R.string.word_consonants20,
                R.string.word_consonants21
        };

        txt = new int[]{
                R.string.txt_consonants01,
                R.string.txt_consonants02,
                R.string.txt_consonants03,
                R.string.txt_consonants04,
                R.string.txt_consonants05,
                R.string.txt_consonants06,
                R.string.txt_consonants07,
                R.string.txt_consonants08,
                R.string.txt_consonants09,
                R.string.txt_consonants10,
                R.string.txt_consonants11,
                R.string.txt_consonants12,
                R.string.txt_consonants13,
                R.string.txt_consonants14,
                R.string.txt_consonants15,
                R.string.txt_consonants16,
                R.string.txt_consonants17,
                R.string.txt_consonants18,
                R.string.txt_consonants19,
                R.string.txt_consonants20,
                R.string.txt_consonants21
        };

        img = new int[]{
                R.drawable.consonants01a,
                R.drawable.consonants02a,
                R.drawable.consonants01a,
                R.drawable.consonants02a,
                R.drawable.consonants01a,
                R.drawable.consonants02a,
                R.drawable.consonants01a,
                R.drawable.consonants02a,
                R.drawable.consonants01a,
                R.drawable.consonants02a,
                R.drawable.consonants01a,
                R.drawable.consonants02a,
                R.drawable.consonants01a,
                R.drawable.consonants02a,
                R.drawable.consonants01a,
                R.drawable.consonants02a,
                R.drawable.consonants01a,
                R.drawable.consonants02a,
                R.drawable.consonants01a,
                R.drawable.consonants02a,
                R.drawable.consonants01a,
                R.drawable.consonants02a,
                R.drawable.consonants01a
        };

        textTitle = (TextView) findViewById(R.id.headerTitle);
        textTitle.setText(R.string.consonantsTitle);

        loadData(position);


        btn_back = (Button) findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position > 0) {
                    position--;
                } else {
                    position = 0;
                }
                loadData(position);
            }
        });

        btn_next = (Button) findViewById(R.id.btn_next);
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position < (txt.length - 1)) {
                    position++;
                } else {
                    position = txt.length - 1;
                }
                loadData(position);
            }
        });

    }

    private void loadData(int position) {
        //btn_control = (RelativeLayout) findViewById(R.id.btn_control);
        texttWord = (TextView) findViewById(R.id.txtWordConsonant);
        textView = (TextView) findViewById(R.id.txtConsonant);

        texttWord.setText(txtWord[position]);
        mp = MediaPlayer.create(this, sound[position]);
        btn_sound = (ImageButton) findViewById(R.id.btn_sound);

        btn_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });


        textView.setText(txt[position]);

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
