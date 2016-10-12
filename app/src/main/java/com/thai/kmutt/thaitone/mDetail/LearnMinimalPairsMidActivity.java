package com.thai.kmutt.thaitone.mDetail;

import android.media.Image;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.thai.kmutt.thaitone.R;

public class LearnMinimalPairsMidActivity extends AppCompatActivity {

    int[] text_mid, text_low, text_thai, text_eng;
    ImageView img_view, imgMid, imgLow;
    TextView txtMid, txtLow, txtThai, txtEng;

    ImageButton btn_sound;
    Button btn_back, btn_next;
    MediaPlayer mp, mp_word;
    int position;
    int[] sound_word, sound_sen, img_low, img_mid, img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.learn_minimal_pairs_mid);
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

        position = 0;
        // Generate sample data

        text_mid = new int[] {
                R.string.thai_tone_5_1,
                R.string.thai_tone_5_3,
                R.string.thai_tone_5_5,
                R.string.thai_tone_5_7,
                R.string.thai_tone_5_9,
                R.string.thai_tone_5_11,
                R.string.thai_tone_5_13,
                R.string.thai_tone_5_15,
                R.string.thai_tone_5_17,
                R.string.thai_tone_5_19,
                R.string.thai_tone_5_21,
                R.string.thai_tone_5_23,
                R.string.thai_tone_5_25,
                R.string.thai_tone_5_27,
                R.string.thai_tone_5_29,
                R.string.thai_tone_5_31,
                R.string.thai_tone_5_33,
                R.string.thai_tone_5_35
        };

        text_low = new int[]{
                R.string.thai_tone_5_2,
                R.string.thai_tone_5_4,
                R.string.thai_tone_5_6,
                R.string.thai_tone_5_8,
                R.string.thai_tone_5_10,
                R.string.thai_tone_5_12,
                R.string.thai_tone_5_14,
                R.string.thai_tone_5_16,
                R.string.thai_tone_5_18,
                R.string.thai_tone_5_20,
                R.string.thai_tone_5_22,
                R.string.thai_tone_5_24,
                R.string.thai_tone_5_26,
                R.string.thai_tone_5_28,
                R.string.thai_tone_5_30,
                R.string.thai_tone_5_32,
                R.string.thai_tone_5_34,
                R.string.thai_tone_5_36
        };

        text_thai = new int[]{
                R.string.word_thai_mimimal_1,
                R.string.word_thai_mimimal_2,
                R.string.word_thai_mimimal_3,
                R.string.word_thai_mimimal_4,
                R.string.word_thai_mimimal_5,
                R.string.word_thai_mimimal_6,
                R.string.word_thai_mimimal_7,
                R.string.word_thai_mimimal_8,
                R.string.word_thai_mimimal_9,
                R.string.word_thai_mimimal_10,
                R.string.word_thai_mimimal_11,
                R.string.word_thai_mimimal_12,
                R.string.word_thai_mimimal_13,
                R.string.word_thai_mimimal_14,
                R.string.word_thai_mimimal_15,
                R.string.word_thai_mimimal_16,
                R.string.word_thai_mimimal_17,
                R.string.word_thai_mimimal_18
        };

        text_eng = new int[]{
                R.string.word_eng_mimimal_1,
                R.string.word_eng_mimimal_2,
                R.string.word_eng_mimimal_3,
                R.string.word_eng_mimimal_4,
                R.string.word_eng_mimimal_5,
                R.string.word_eng_mimimal_6,
                R.string.word_eng_mimimal_7,
                R.string.word_eng_mimimal_8,
                R.string.word_eng_mimimal_9,
                R.string.word_eng_mimimal_10,
                R.string.word_eng_mimimal_11,
                R.string.word_eng_mimimal_12,
                R.string.word_eng_mimimal_13,
                R.string.word_eng_mimimal_14,
                R.string.word_eng_mimimal_15,
                R.string.word_eng_mimimal_16,
                R.string.word_eng_mimimal_17,
                R.string.word_eng_mimimal_18
        };

        sound_word = new int[]{
             R.raw.mimi_01_a,
                R.raw.mimi_02_a,
                R.raw.mimi_03_a,
                R.raw.mimi_04_a,
                R.raw.mimi_05_a,
                R.raw.mimi_07_a,
                R.raw.mimi_08_a,
                R.raw.mimi_09_a,
                R.raw.mimi_10_a,
                R.raw.mimi_22_a,
                R.raw.mimi_23_a,
                R.raw.mimi_25_a,
                R.raw.mimi_26_a,
                R.raw.mimi_27_a,
                R.raw.mimi_28_a,
                R.raw.mimi_29_a,
                R.raw.mimi_30_a,
                R.raw.mimi_32_a,
        };
        sound_sen = new int[]{
          R.raw.mimi_01_b,
                R.raw.mimi_02_b,
                R.raw.mimi_03_b,
                R.raw.mimi_04_b,
                R.raw.mimi_05_b,
                R.raw.mimi_07_b,
                R.raw.mimi_08_b,
                R.raw.mimi_09_b,
                R.raw.mimi_10_b,
                R.raw.mimi_22_b,
                R.raw.mimi_23_c,
                R.raw.mimi_25_b,
                R.raw.mimi_26_b,
                R.raw.mimi_27_b,
                R.raw.mimi_28_b,
                R.raw.mimi_29_b,
                R.raw.mimi_30_b,
                R.raw.mimi_32_b,
        };


        img = new int[]{
            R.drawable.minimal_01,
                R.drawable.minimal_02,
                R.drawable.minimal_03,
                R.drawable.minimal_04,
                R.drawable.minimal_06,
                R.drawable.minimal_07,
                R.drawable.minimal_08,
                R.drawable.minimal_09,
                R.drawable.minimal_10,
                R.drawable.minimal_11,
                R.drawable.minimal_12,
                R.drawable.minimal_13,
                R.drawable.minimal_14,
                R.drawable.minimal_15,
                R.drawable.minimal_16,
                R.drawable.minimal_17,
                R.drawable.minimal_18,
                R.drawable.minimal_19
        };


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
                if (position < (text_low.length - 1)) {
                    position++;
                } else {
                    position = text_low.length - 1;
                }
                loadData(position);
            }
        });

    }

    private void loadData(int position) {
        img_view = (ImageView)findViewById(R.id.img);
        txtMid = (TextView)findViewById(R.id.txtMid);
        txtLow = (TextView)findViewById(R.id.txtLow);
        txtThai = (TextView)findViewById(R.id.txtThai);
        txtEng = (TextView)findViewById(R.id.txtEng);

        txtMid.setText(text_mid[position]);
        txtLow.setText(text_low[position]);
        txtThai.setText(text_thai[position]);
        txtEng.setText(text_eng[position]);

        img_view.setImageResource(img[position]);
        mp = MediaPlayer.create(this, sound_sen[position]);
        mp_word = MediaPlayer.create(this,sound_word[position]);
        btn_sound = (ImageButton) findViewById(R.id.btn_sound);

        btn_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });

        txtMid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp_word.start();
            }
        });

        txtLow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp_word.start();
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
