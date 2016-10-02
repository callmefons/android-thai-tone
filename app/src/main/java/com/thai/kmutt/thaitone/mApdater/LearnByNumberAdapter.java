package com.thai.kmutt.thaitone.mApdater;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.thai.kmutt.thaitone.R;
import com.thai.kmutt.thaitone.mData.LearnByNumber;
import com.thai.kmutt.thaitone.mData.ThaiTone;
import com.thai.kmutt.thaitone.mDetail.DetailActivity;
import com.thai.kmutt.thaitone.mDetail.LearnByNumberDetail;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * Created by 006075 on 2/10/2559.
 */

public class LearnByNumberAdapter extends BaseAdapter {
    public static final  int TYPE_ITEM = 0;
    public static final int TYPE_SEPARATOR = 1;

    Context c;

    ArrayList<Object> learan_by_number;

    TreeSet<Integer> sectionHeader = new TreeSet<Integer>();

    LayoutInflater inflater;

    public LearnByNumberAdapter(Context c, ArrayList<Object> leran_by_number) {
        this.c = c;
        this.learan_by_number = leran_by_number;

        inflater= (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return learan_by_number.size();
    }

    @Override
    public Object getItem(int position) {
        return learan_by_number.get(position);
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
        if (getItem(position) instanceof LearnByNumber) {
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
                    view = inflater.inflate(R.layout.learn_by_number_list, viewGroup, false);
                    break;
                case TYPE_SEPARATOR:
                    view = inflater.inflate(R.layout.learning_each_thai_header_detail, viewGroup, false);
                    break;
            }
        }

        switch (type) {
            case TYPE_ITEM:
                TextView nameText = (TextView)view.findViewById(R.id.nameLabel);
                LearnByNumber learn_by_number = (LearnByNumber) getItem(position);

                final String name_thai = learn_by_number.getName_thai();
                final String name_eng = learn_by_number.getName_eng();
                final int number = learn_by_number.getImg();

                nameText.setText(name_thai);

                view.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        openDetailActivity(name_thai, name_eng,number);
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

    public void openDetailActivity(String name_thai, String name_eng,int number)
    {
        Intent i = new Intent(c, LearnByNumberDetail.class);
        i.putExtra("NAME_THAI_KEY", name_thai);
        i.putExtra("NAME_ENG_KEY", name_eng);
        i.putExtra("NUMBER_KEY", number);

        c.startActivity(i);
    }

}
