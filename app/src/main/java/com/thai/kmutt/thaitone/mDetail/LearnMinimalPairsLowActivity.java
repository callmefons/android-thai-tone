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

public class LearnMinimalPairsLowActivity extends AppCompatActivity {

    int[] text_high, text_low, text_thai, text_eng;
    ImageView img_view, imgMid, imgLow;
    TextView txtHigh, txtLow, txtThai, txtEng;

    ImageButton btn_sound;
    Button btn_back, btn_next;
    MediaPlayer mp, mp_word;
    int position;
    int[] sound_word, sound_sen, img_low, img_mid, img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.learn_minimal_pairs_low);
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

        text_low = new int[] {
                R.string.thai_tone_6_1,
                R.string.thai_tone_6_3,
                R.string.thai_tone_6_5,
                R.string.thai_tone_6_7,
                R.string.thai_tone_6_9,
                R.string.thai_tone_6_11,
                R.string.thai_tone_6_13,
                R.string.thai_tone_6_15,
                R.string.thai_tone_6_17,
                R.string.thai_tone_6_19,
                R.string.thai_tone_6_21,
                R.string.thai_tone_6_23,
                R.string.thai_tone_6_25,
                R.string.thai_tone_6_27,
                R.string.thai_tone_6_29,
                R.string.thai_tone_6_31,
                R.string.thai_tone_6_33,
                R.string.thai_tone_6_35
        };

        text_high = new int[]{
                R.string.thai_tone_6_2,
                R.string.thai_tone_6_4,
                R.string.thai_tone_6_6,
                R.string.thai_tone_6_8,
                R.string.thai_tone_6_10,
                R.string.thai_tone_6_12,
                R.string.thai_tone_6_14,
                R.string.thai_tone_6_16,
                R.string.thai_tone_6_18,
                R.string.thai_tone_6_20,
                R.string.thai_tone_6_22,
                R.string.thai_tone_6_24,
                R.string.thai_tone_6_26,
                R.string.thai_tone_6_28,
                R.string.thai_tone_6_30,
                R.string.thai_tone_6_32,
                R.string.thai_tone_6_34,
                R.string.thai_tone_6_36
        };

        text_thai = new int[]{
                R.string.word_thai_mimimal_19,
                R.string.word_thai_mimimal_20,
                R.string.word_thai_mimimal_21,
                R.string.word_thai_mimimal_22,
                R.string.word_thai_mimimal_23,
                R.string.word_thai_mimimal_24,
                R.string.word_thai_mimimal_25,
                R.string.word_thai_mimimal_26,
                R.string.word_thai_mimimal_27,
                R.string.word_thai_mimimal_28,
                R.string.word_thai_mimimal_29,
                R.string.word_thai_mimimal_30,
                R.string.word_thai_mimimal_31,
                R.string.word_thai_mimimal_32,
                R.string.word_thai_mimimal_33,
                R.string.word_thai_mimimal_34,
                R.string.word_thai_mimimal_35,
                R.string.word_thai_mimimal_36
        };

        text_eng = new int[]{
                R.string.word_eng_mimimal_19,
                R.string.word_eng_mimimal_20,
                R.string.word_eng_mimimal_21,
                R.string.word_eng_mimimal_22,
                R.string.word_eng_mimimal_23,
                R.string.word_eng_mimimal_24,
                R.string.word_eng_mimimal_25,
                R.string.word_eng_mimimal_26,
                R.string.word_eng_mimimal_27,
                R.string.word_eng_mimimal_28,
                R.string.word_eng_mimimal_29,
                R.string.word_eng_mimimal_30,
                R.string.word_eng_mimimal_31,
                R.string.word_eng_mimimal_32,
                R.string.word_eng_mimimal_33,
                R.string.word_eng_mimimal_34,
                R.string.word_eng_mimimal_35,
                R.string.word_eng_mimimal_36
        };

        sound_word = new int[]{
                R.raw.mimi_33_a,
                R.raw.mimi_34_a,
                R.raw.mimi_35_a,
                R.raw.mimi_36_a,
                R.raw.mimi_37_a,
                R.raw.mimi_38_a,
                R.raw.mimi_39_a,
                R.raw.mimi_40_a,
                R.raw.mimi_41_a,
                R.raw.mimi_43_a,
                R.raw.mimi_44_a,
                R.raw.mimi_45_a,
                R.raw.mimi_46_a,
                R.raw.mimi_47_a,
                R.raw.mimi_50_a,
                R.raw.mimi_51_a,
                R.raw.mimi_53_a,
                R.raw.mimi_54_a,
                R.raw.mimi_55_a
        };
        sound_sen = new int[]{
                R.raw.mimi_33_b,
                R.raw.mimi_34_b,
                R.raw.mimi_35_b,
                R.raw.mimi_36_b,
                R.raw.mimi_37_b,
                R.raw.mimi_38_b,
                R.raw.mimi_39_a,
                R.raw.mimi_40_b,
                R.raw.mimi_41_b,
                R.raw.mimi_43_b,
                R.raw.mimi_44_b,
                R.raw.mimi_45_b,
                R.raw.mimi_46_b,
                R.raw.mimi_47_b,
                R.raw.mimi_50_b,
                R.raw.mimi_51_b,
                R.raw.mimi_53_b,
                R.raw.mimi_54_b,
                R.raw.mimi_55_b
        };


        img = new int[]{
                R.drawable.minimal_20,
                R.drawable.minimal_21,
                R.drawable.minimal_22,
                R.drawable.minimal_23,
                R.drawable.minimal_24,
                R.drawable.minimal_25,
                R.drawable.minimal_26,
                R.drawable.minimal_27,
                R.drawable.minimal_28,
                R.drawable.minimal_29,
                R.drawable.minimal_30,
                R.drawable.minimal_31,
                R.drawable.minimal_32,
                R.drawable.minimal_33,
                R.drawable.minimal_34,
                R.drawable.minimal_35,
                R.drawable.minimal_36,
                R.drawable.minimal_37
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
        txtHigh = (TextView)findViewById(R.id.txtMid);
        txtLow = (TextView)findViewById(R.id.txtLow);
        txtThai = (TextView)findViewById(R.id.txtThai);
        txtEng = (TextView)findViewById(R.id.txtEng);

        txtLow.setText(text_low[position]);
        txtHigh.setText(text_high[position]);
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

        txtHigh.setOnClickListener(new View.OnClickListener() {
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
