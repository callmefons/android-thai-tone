package com.thai.kmutt.thaitone.mDetail;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.media.MediaPlayer;
import android.speech.RecognizerIntent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.thai.kmutt.thaitone.R;

import java.util.ArrayList;

public class VowelsPracticeDetailActivity extends AppCompatActivity {

    private final int SPEECH_RECOGNITION_CODE = 1;
    TextView nameTxt;
    ImageButton btn_sound,btnMicrophone;
    MediaPlayer mp;
    int name;

    private TextView txtShowResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vowels_practice_detail);
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
        nameTxt= (TextView)findViewById(R.id.nameTxt);
        btn_sound = (ImageButton)findViewById(R.id.btn_sound);
        Intent i = this.getIntent();
        name = i.getExtras().getInt("NAME_KEY");
        final int sound = i.getExtras().getInt("SOUND_KEY");
        mp = MediaPlayer.create(this, sound);
        nameTxt.setText(name);
        btn_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });


//        txtShowResult = (TextView) findViewById(R.id.txtShowResult);
        btnMicrophone = (ImageButton) findViewById(R.id.btnMicrophone);
        btnMicrophone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSpeechToText();
            }
        });

    }

    private void startSpeechToText() {
        Log.e("Msg","What you have to print");

        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, "th-TH");
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_PROMPT,
                "Speak something");

        try{
            startActivityForResult(intent, SPEECH_RECOGNITION_CODE);
        }catch (ActivityNotFoundException a){
            Toast.makeText(getApplicationContext(),
                    "Sorry! Speech recognition is not supported in this device",
                    Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * Callback for speech recognition activity
     * */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case SPEECH_RECOGNITION_CODE: {
                if (resultCode == RESULT_OK && null != data) {
                    ArrayList<String> result = data
                            .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    String text = result.get(0);
                    //txtOutput.setText(text);
                    if(text.equals(this.name)){
                        Toast.makeText(this,
                                "Correct", Toast.LENGTH_LONG).show();
                    }else{
                        Toast.makeText(this,
                                "Wrong", Toast.LENGTH_LONG).show();
                    }

                }
                break;
            }
        }
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
