package com.thai.kmutt.thaitone.mData;

import com.thai.kmutt.thaitone.R;

import java.util.ArrayList;

/**
 * Created by 006075 on 3/10/2559.
 */

public class LearnByColorsCollection {

    public static ArrayList<Object> getLernByColor() {
        ArrayList<Object> learn_by_colors = new ArrayList<>();
        LearnByColors learn_by_color = null;

        //Set 1
        learn_by_colors.add("เสียงสามัญ");
        learn_by_color = new LearnByColors();
        learn_by_color.setName_thai("ฟ้า");
        learn_by_color.setName_eng("blue");
        learn_by_color.setImg(R.drawable.thaitone05);
        learn_by_colors.add(learn_by_color);
        //Set 1
        learn_by_colors.add("เสียงเอก");
        learn_by_color = new LearnByColors();
        learn_by_color.setName_thai("ฟ้า");
        learn_by_color.setName_eng("blue");
        learn_by_color.setImg(R.drawable.thaitone05);
        learn_by_colors.add(learn_by_color);


        return learn_by_colors;
    }
}
