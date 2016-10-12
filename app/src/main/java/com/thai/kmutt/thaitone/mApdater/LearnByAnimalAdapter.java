package com.thai.kmutt.thaitone.mApdater;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.thai.kmutt.thaitone.R;
import com.thai.kmutt.thaitone.mData.LearnByAnimal;
import com.thai.kmutt.thaitone.mData.LearnByNumber;
import com.thai.kmutt.thaitone.mDetail.LearnByAnimalDetailActivity;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * Created by 006075 on 3/10/2559.
 */

public class LearnByAnimalAdapter extends BaseAdapter {

    public static final  int TYPE_ITEM = 0;
    public static final int TYPE_SEPARATOR = 1;

    Context c;

    ArrayList<Object> learan_by_animal;

    TreeSet<Integer> sectionHeader = new TreeSet<Integer>();

    LayoutInflater inflater;

    public LearnByAnimalAdapter(Context c, ArrayList<Object> learan_by_animal) {
        this.c = c;
        this.learan_by_animal = learan_by_animal;

        inflater= (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return learan_by_animal.size();
    }

    @Override
    public Object getItem(int position) {
        return learan_by_animal.get(position);
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
        if (getItem(position) instanceof LearnByAnimal) {
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
                    view = inflater.inflate(R.layout.learn_by_animal_list, viewGroup, false);
                    break;
                case TYPE_SEPARATOR:
                    view = inflater.inflate(R.layout.learning_each_thai_header_detail, viewGroup, false);
                    break;
            }
        }

        switch (type) {
            case TYPE_ITEM:
                TextView txtTitle = (TextView) view.findViewById(R.id.item);
                ImageView imageView = (ImageView) view.findViewById(R.id.icon);
                TextView extratxt = (TextView) view.findViewById(R.id.itemDescription);                          LearnByAnimal learn_by_animal = (LearnByAnimal) getItem(position);

                final String name_thai = learn_by_animal.getName_thai();
                final String name_eng = learn_by_animal.getName_eng();
                final int img = learn_by_animal.getImg();
                final int sound = learn_by_animal.getSound();

                txtTitle.setText(name_thai);
                extratxt.setText(name_eng);
                imageView.setImageResource(img);

                view.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        openDetailActivity(name_thai, name_eng,img,sound);
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

    public void openDetailActivity(String name_thai, String name_eng,int img, int sound)
    {
        Intent i = new Intent(c, LearnByAnimalDetailActivity.class);
        i.putExtra("NAME_THAI_KEY", name_thai);
        i.putExtra("NAME_ENG_KEY", name_eng);
        i.putExtra("IMAGE_KEY", img);
        i.putExtra("SOUND_KEY", sound);

        c.startActivity(i);
    }
}
