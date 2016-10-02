package com.thai.kmutt.thaitone.mData;

import com.thai.kmutt.thaitone.R;

import java.util.ArrayList;

/**
 * Created by 006075 on 3/10/2559.
 */

public class LearnByThingsCollection {

    public static ArrayList<Object> getLernByThings() {
        ArrayList<Object> learn_by_things = new ArrayList<>();
        LearnByThings learn_by_thing = null;

        //Set 1
        learn_by_things.add("เสียงสามัญ");
        learn_by_thing = new LearnByThings();
        learn_by_thing.setName_thai("กา");
        learn_by_thing.setName_eng("kettle");
        learn_by_thing.setImg(R.drawable.thaitone05);
        learn_by_things.add(learn_by_thing);
        //Set 1
        learn_by_things.add("เสียงเอก");
        learn_by_thing = new LearnByThings();
        learn_by_thing.setName_thai("กา");
        learn_by_thing.setName_eng("crow");
        learn_by_thing.setImg(R.drawable.thaitone05);
        learn_by_things.add(learn_by_thing);


        return learn_by_things;
    }
}
