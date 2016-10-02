package com.thai.kmutt.thaitone.mDetail;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.thai.kmutt.thaitone.R;

/**
 * Created by 006075 on 2/10/2559.
 */

public class VowelsDetailActivity extends AppCompatActivity {
    int[] txt, txtWord;
    int[] img;
    int[] sound, sound_question;

    TextView textView, texttWord, textTitle;
    ImageButton btn_sound;
    Button btn_back, btn_next;
    MediaPlayer mp;
    RelativeLayout btn_control;
    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vowels_content);
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
                R.raw.v23,
                R.raw.v24,
                R.raw.v25,
                R.raw.v26,
                R.raw.v27,
                R.raw.v28,
                R.raw.v29,
                R.raw.v30,
                R.raw.v31,
                R.raw.v32,
                R.raw.v33,
                R.raw.v34,
                R.raw.v35,
                R.raw.v36,
                R.raw.v37,
                R.raw.v38,
                R.raw.v39,
                R.raw.v40,
                R.raw.v41,
                R.raw.v42,
                R.raw.v43
        };

        // Generate sample data
        sound_question = new int[]{
                R.raw.v109,
                R.raw.v101,
                R.raw.v109,
                R.raw.v102,
                R.raw.v110,
                R.raw.v103,
                R.raw.v111,
                R.raw.v104,
                R.raw.v107,
                R.raw.v112,
                R.raw.v106,
                R.raw.v105,
                R.raw.v113
        };

        txtWord = new int[]{
                R.string.word_vowels01,
                R.string.word_vowels02,
                R.string.word_vowels03,
                R.string.word_vowels04,
                R.string.word_vowels05,
                R.string.word_vowels06,
                R.string.word_vowels07,
                R.string.word_vowels08,
                R.string.word_vowels09,
                R.string.word_vowels10,
                R.string.word_vowels11,
                R.string.word_vowels12,
                R.string.word_vowels13,
                R.string.word_vowels14,
                R.string.word_vowels15,
                R.string.word_vowels16,
                R.string.word_vowels17,
                R.string.word_vowels18,
                R.string.word_vowels19,
                R.string.word_vowels20,
                R.string.word_vowels21
        };

        txt = new int[]{
                R.string.txt_vowelds01,
                R.string.txt_vowelds02,
                R.string.txt_vowelds03,
                R.string.txt_vowelds04,
                R.string.txt_vowelds05,
                R.string.txt_vowelds06,
                R.string.txt_vowelds07,
                R.string.txt_vowelds08,
                R.string.txt_vowelds09,
                R.string.txt_vowelds10,
                R.string.txt_vowelds11,
                R.string.txt_vowelds12,
                R.string.txt_vowelds13,
                R.string.txt_vowelds14,
                R.string.txt_vowelds15,
                R.string.txt_vowelds16,
                R.string.txt_vowelds17,
                R.string.txt_vowelds18,
                R.string.txt_vowelds19,
                R.string.txt_vowelds20,
                R.string.txt_vowelds21
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
        texttWord = (TextView) findViewById(R.id.txtVowels);
        textView = (TextView) findViewById(R.id.txtVowels2);

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
