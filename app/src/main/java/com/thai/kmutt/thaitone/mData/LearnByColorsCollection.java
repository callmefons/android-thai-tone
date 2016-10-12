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
        learn_by_colors.add("เสียงสามัญ (Mid)");
        learn_by_color = new LearnByColors();
        learn_by_color.setName_thai("คราม");
        learn_by_color.setName_eng("indigo");
        learn_by_color.setImg(R.drawable.color01);
        learn_by_color.setSound(R.raw.color01);
        learn_by_colors.add(learn_by_color);

        learn_by_color = new LearnByColors();
        learn_by_color.setName_thai("เงิน");
        learn_by_color.setName_eng("silver");
        learn_by_color.setImg(R.drawable.color02);
        learn_by_color.setSound(R.raw.color02);
        learn_by_colors.add(learn_by_color);

        learn_by_color = new LearnByColors();
        learn_by_color.setName_thai("ชมพู");
        learn_by_color.setName_eng("pink");
        learn_by_color.setImg(R.drawable.color03);
        learn_by_color.setSound(R.raw.color03);
        learn_by_colors.add(learn_by_color);

        learn_by_color = new LearnByColors();
        learn_by_color.setName_thai("ดำ");
        learn_by_color.setName_eng("black");
        learn_by_color.setImg(R.drawable.color04);
        learn_by_color.setSound(R.raw.color04);
        learn_by_colors.add(learn_by_color);

        learn_by_color = new LearnByColors();
        learn_by_color.setName_thai("แดง");
        learn_by_color.setName_eng("red");
        learn_by_color.setImg(R.drawable.color05);
        learn_by_color.setSound(R.raw.color05);
        learn_by_colors.add(learn_by_color);

        learn_by_color = new LearnByColors();
        learn_by_color.setName_thai("ทอง");
        learn_by_color.setName_eng("gold");
        learn_by_color.setImg(R.drawable.color06);
        learn_by_color.setSound(R.raw.color06);
        learn_by_colors.add(learn_by_color);

        learn_by_color = new LearnByColors();
        learn_by_color.setName_thai("เทา");
        learn_by_color.setName_eng("grey");
        learn_by_color.setImg(R.drawable.color07);
        learn_by_color.setSound(R.raw.color07);
        learn_by_colors.add(learn_by_color);

        //Set 2
        learn_by_colors.add("เสียงเอก (Low)");
        learn_by_color = new LearnByColors();
        learn_by_color.setName_thai("สด");
        learn_by_color.setName_eng("colorful");
        learn_by_color.setImg(R.drawable.color08);
        learn_by_color.setSound(R.raw.color08);
        learn_by_colors.add(learn_by_color);

        learn_by_color = new LearnByColors();
        learn_by_color.setName_thai("แสด");
        learn_by_color.setName_eng("orange");
        learn_by_color.setImg(R.drawable.color09);
        learn_by_color.setSound(R.raw.color09);
        learn_by_colors.add(learn_by_color);


        //Set 3
        learn_by_colors.add("โท (Falling)");
        learn_by_color = new LearnByColors();
        learn_by_color.setName_thai("ส้ม");
        learn_by_color.setName_eng("orange");
        learn_by_color.setImg(R.drawable.color10);
        learn_by_color.setSound(R.raw.color10);
        learn_by_colors.add(learn_by_color);


        //Set 4
        learn_by_colors.add("เสียงตรี (High)");
        learn_by_color = new LearnByColors();
        learn_by_color.setName_thai("ฟ้า");
        learn_by_color.setName_eng("blue");
        learn_by_color.setImg(R.drawable.color11);
        learn_by_color.setSound(R.raw.color11);
        learn_by_colors.add(learn_by_color);

        //Set 5
        learn_by_colors.add("เสียงจัตวา (Rising)");
        learn_by_color = new LearnByColors();
        learn_by_color.setName_thai("ขาว");
        learn_by_color.setName_eng("white");
        learn_by_color.setImg(R.drawable.color12);
        learn_by_color.setSound(R.raw.color12);
        learn_by_colors.add(learn_by_color);

        learn_by_color = new LearnByColors();
        learn_by_color.setName_thai("เขียว");
        learn_by_color.setName_eng("green");
        learn_by_color.setImg(R.drawable.color13);
        learn_by_color.setSound(R.raw.color13);
        learn_by_colors.add(learn_by_color);

        learn_by_color = new LearnByColors();
        learn_by_color.setName_thai("เหลือง");
        learn_by_color.setName_eng("yellow");
        learn_by_color.setImg(R.drawable.color14);
        learn_by_color.setSound(R.raw.color14);
        learn_by_colors.add(learn_by_color);


        return learn_by_colors;
    }
}
