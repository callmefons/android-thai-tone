package com.thai.kmutt.thaitone.mApdater;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.thai.kmutt.thaitone.R;
import com.thai.kmutt.thaitone.mData.ThaiTone;
import com.thai.kmutt.thaitone.mDetail.DetailActivity;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * Created by 006075 on 24/9/2559.
 */

public class LearnEachThaiAdapter extends BaseAdapter{

    public static final  int TYPE_ITEM = 0;
    public static final int TYPE_SEPARATOR = 1;

    Context c;

    ArrayList<Object> spaceCrafts;
    TreeSet<Integer> sectionHeader = new TreeSet<Integer>();

    LayoutInflater inflater;

    public LearnEachThaiAdapter(Context c, ArrayList<Object> spaceCrafts) {
        this.c = c;
        this.spaceCrafts = spaceCrafts;

        inflater= (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return spaceCrafts.size();
    }

    @Override
    public Object getItem(int position) {
        return spaceCrafts.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getViewTypeCount() {

        return 2;
    }

    @Override
    public int getItemViewType(int position) {
        if (getItem(position) instanceof ThaiTone) {
            return TYPE_ITEM;
        }

        return TYPE_SEPARATOR;
    }

    @Override
    public boolean isEnabled(int position) {
        return (getItemViewType(position) == TYPE_ITEM);
    }


    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        int type = getItemViewType(position);
        if(view == null)
        {
            //view=inflater.inflate(R.layout.model,viewGroup,false);
            switch (type) {
                case TYPE_ITEM:
                    view = inflater.inflate(R.layout.learning_each_thai_content_main, viewGroup, false);
                    break;
                case TYPE_SEPARATOR:
                    view = inflater.inflate(R.layout.learning_each_thai_header_detail, viewGroup, false);
                    break;
            }
        }

        switch (type) {
            case TYPE_ITEM:
                TextView nameText = (TextView)view.findViewById(R.id.nameLabel);
                ThaiTone thaiTone = (ThaiTone) getItem(position);

                final String name = thaiTone.getName();
                final String tone = thaiTone.getTone();
                final String meaning = thaiTone.getMeaning();
                final int imgTone = thaiTone.getImg();

                nameText.setText(name);

                view.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        openDetailActivity(name,tone,meaning,imgTone);
                    }
                });

                break;
            case TYPE_SEPARATOR:
                TextView title = (TextView)view.findViewById(R.id.headerTitle);
                String titleString = (String)getItem(position);
                title.setText(titleString);
                break;
        }

        return view;
    }

    public void openDetailActivity(String name, String tone, String meaning, int imgTone)
    {
        Intent i = new Intent(c, DetailActivity.class);
        i.putExtra("NAME_KEY", name);
        i.putExtra("NAME_TONE_KEY", tone);
        i.putExtra("NAME_MEANING_KEY", meaning);
        i.putExtra("IMAGE_TONE_KEY", imgTone);

        c.startActivity(i);
    }

}
