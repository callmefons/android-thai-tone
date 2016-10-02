package com.thai.kmutt.thaitone.mDetail;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.thai.kmutt.thaitone.R;

public class DetailActivity extends AppCompatActivity {

    TextView nameTxt;
    TextView nameTxtTone;
    TextView nameTxtMeaning;
    ImageView imgTone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.learning_each_thai_activity_details);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        nameTxt= (TextView)findViewById(R.id.nameTxt);
        nameTxtTone= (TextView)findViewById(R.id.nameTxtTone);
        nameTxtMeaning= (TextView)findViewById(R.id.nameTxtMeaning);
        imgTone = (ImageView)findViewById(R.id.imgTone);

        Intent i = this.getIntent();
        String name = i.getExtras().getString("NAME_KEY");
        String tone = i.getExtras().getString("NAME_TONE_KEY");
        String meaning = i.getExtras().getString("NAME_MEANING_KEY");
        int img = i.getExtras().getInt("IMAGE_TONE_KEY");

        nameTxt.setText(name);
        nameTxtTone.setText(tone);
        nameTxtMeaning.setText(meaning);
        imgTone.setImageResource(img);


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
