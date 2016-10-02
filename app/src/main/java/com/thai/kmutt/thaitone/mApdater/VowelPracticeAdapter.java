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
import com.thai.kmutt.thaitone.mData.Vowels;
import com.thai.kmutt.thaitone.mDetail.DetailActivity;
import com.thai.kmutt.thaitone.mDetail.VowelsDetailActivity;
import com.thai.kmutt.thaitone.mDetail.VowelsPracticeDetailActivity;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * Created by 006075 on 2/10/2559.
 */

public class VowelPracticeAdapter extends BaseAdapter{

    public static final  int TYPE_ITEM = 0;
    public static final int TYPE_SEPARATOR = 1;

    Context c;

    ArrayList<Object> vowels;
    TreeSet<Integer> sectionHeader = new TreeSet<Integer>();

    LayoutInflater inflater;

    public VowelPracticeAdapter(Context c, ArrayList<Object> vowels) {
        this.c = c;
        this.vowels = vowels;

        inflater= (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return vowels.size();
    }

    @Override
    public Object getItem(int position) {
        return vowels.get(position);
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
        if (getItem(position) instanceof Vowels) {
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
        if (view == null) {
            //view=inflater.inflate(R.layout.model,viewGroup,false);
            switch (type) {
                case TYPE_ITEM:
                    view = inflater.inflate(R.layout.vowels_practice_list, viewGroup, false);
                    break;
            }
        }

        switch (type) {
            case TYPE_ITEM:

                TextView nameText = (TextView) view.findViewById(R.id.nameLabel);
                Vowels vowels = (Vowels) getItem(position);

                final int name = vowels.getName();
                final int sound = vowels.getSound();

                nameText.setText(name);


                view.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        openDetailActivity(name, sound);
                    }
                });

                break;
        }
        return view;
    }

    public void openDetailActivity(int name, int sound)
    {
        Intent i = new Intent(c, VowelsPracticeDetailActivity.class);
        i.putExtra("NAME_KEY", name);
        i.putExtra("SOUND_KEY", sound);

        c.startActivity(i);
    }
}
