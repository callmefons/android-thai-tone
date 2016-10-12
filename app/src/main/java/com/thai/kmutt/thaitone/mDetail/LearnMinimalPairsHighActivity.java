package com.thai.kmutt.thaitone.mDetail;

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

public class LearnMinimalPairsHighActivity extends AppCompatActivity {

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
                R.string.thai_tone_7_1,
                R.string.thai_tone_7_3,
                R.string.thai_tone_7_5,
                R.string.thai_tone_7_7,
                R.string.thai_tone_7_9,
                R.string.thai_tone_7_11,
                R.string.thai_tone_7_13,
                R.string.thai_tone_7_15,
                R.string.thai_tone_7_17,
                R.string.thai_tone_7_19,
                R.string.thai_tone_7_21,
                R.string.thai_tone_7_23
        };

        text_high = new int[]{
                R.string.thai_tone_7_2,
                R.string.thai_tone_7_4,
                R.string.thai_tone_7_6,
                R.string.thai_tone_7_8,
                R.string.thai_tone_7_10,
                R.string.thai_tone_7_12,
                R.string.thai_tone_7_14,
                R.string.thai_tone_7_16,
                R.string.thai_tone_7_18,
                R.string.thai_tone_7_20,
                R.string.thai_tone_7_22,
                R.string.thai_tone_7_24
        };

        text_thai = new int[]{
                R.string.word_thai_mimimal_37,
                R.string.word_thai_mimimal_38,
                R.string.word_thai_mimimal_39,
                R.string.word_thai_mimimal_40,
                R.string.word_thai_mimimal_41,
                R.string.word_thai_mimimal_42,
                R.string.word_thai_mimimal_43,
                R.string.word_thai_mimimal_44,
                R.string.word_thai_mimimal_45,
                R.string.word_thai_mimimal_46,
                R.string.word_thai_mimimal_47,
                R.string.word_thai_mimimal_48
        };

        text_eng = new int[]{
                R.string.word_eng_mimimal_37,
                R.string.word_eng_mimimal_38,
                R.string.word_eng_mimimal_39,
                R.string.word_eng_mimimal_40,
                R.string.word_eng_mimimal_41,
                R.string.word_eng_mimimal_42,
                R.string.word_eng_mimimal_43,
                R.string.word_eng_mimimal_44,
                R.string.word_eng_mimimal_45,
                R.string.word_eng_mimimal_46,
                R.string.word_eng_mimimal_47,
                R.string.word_eng_mimimal_48
        };

        sound_word = new int[]{
                R.raw.mimi_55_a,
                R.raw.mimi_56_a,
                R.raw.mimi_58_a,
                R.raw.mimi_59_a,
                R.raw.mimi_61_a,
                R.raw.mimi_62_a,
                R.raw.mimi_63_a,
                R.raw.mimi_65_a,
                R.raw.mimi_66_a,
                R.raw.mimi_67_a,
                R.raw.mimi_68_a,
                R.raw.mimi_69_a
        };
        sound_sen = new int[]{
                R.raw.mimi_55_b,
                R.raw.mimi_56_b,
                R.raw.mimi_58_b,
                R.raw.mimi_59_b,
                R.raw.mimi_61_b,
                R.raw.mimi_62_b,
                R.raw.mimi_63_b,
                R.raw.mimi_65_b,
                R.raw.mimi_66_b,
                R.raw.mimi_67_b,
                R.raw.mimi_68_b,
                R.raw.mimi_69_b
        };


        img = new int[]{
                R.drawable.minimal_38,
                R.drawable.minimal_39,
                R.drawable.minimal_40,
                R.drawable.minimal_41,
                R.drawable.minimal_42,
                R.drawable.minimal_43,
                R.drawable.minimal_44,
                R.drawable.minimal_45,
                R.drawable.minimal_46,
                R.drawable.minimal_47,
                R.drawable.minimal_48,
                R.drawable.minimal_49
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
