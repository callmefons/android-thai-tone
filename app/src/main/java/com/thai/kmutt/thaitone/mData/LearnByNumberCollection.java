package com.thai.kmutt.thaitone.mData;

import com.thai.kmutt.thaitone.R;

import java.util.ArrayList;

/**
 * Created by 006075 on 2/10/2559.
 */

public class LearnByNumberCollection {

    public static ArrayList<Object> getLernByNumber() {
        ArrayList<Object> learn_by_numbers = new ArrayList<>();
        LearnByNumber learn_by_number = null;

        //Set 1
        learn_by_numbers.add("ตัวเลข 10-100");
        learn_by_number = new LearnByNumber();
        learn_by_number.setName_thai("สิบ");
        learn_by_number.setName_eng("ten");
        learn_by_number.setImg(10);
        learn_by_numbers.add(learn_by_number);

        learn_by_numbers.add("ตัวเลข 200-1000");
        learn_by_number = new LearnByNumber();
        learn_by_number.setName_thai("สิบ");
        learn_by_number.setName_eng("ten");
        learn_by_number.setImg(10);
        learn_by_numbers.add(learn_by_number);

        learn_by_numbers.add("ตัวเลข 2000-10000");
        learn_by_number = new LearnByNumber();
        learn_by_number.setName_thai("สิบ");
        learn_by_number.setName_eng("ten");
        learn_by_number.setImg(10);
        learn_by_numbers.add(learn_by_number);

        learn_by_numbers.add("ตัวเลข 20000-100000");
        learn_by_number = new LearnByNumber();
        learn_by_number.setName_thai("สิบ");
        learn_by_number.setName_eng("ten");
        learn_by_number.setImg(10);
        learn_by_numbers.add(learn_by_number);

        learn_by_numbers.add("ตัวเลข 200000-1000000");
        learn_by_number = new LearnByNumber();
        learn_by_number.setName_thai("สิบ");
        learn_by_number.setName_eng("ten");
        learn_by_number.setImg(10);
        learn_by_numbers.add(learn_by_number);

        learn_by_numbers.add("ตัวเลข 2000000-9000000");
        learn_by_number = new LearnByNumber();
        learn_by_number.setName_thai("สิบ");
        learn_by_number.setName_eng("ten");
        learn_by_number.setImg(10);
        learn_by_numbers.add(learn_by_number);

        return learn_by_numbers;
    }

}
