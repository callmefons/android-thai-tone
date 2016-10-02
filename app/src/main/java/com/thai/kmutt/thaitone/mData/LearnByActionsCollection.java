package com.thai.kmutt.thaitone.mData;

import com.thai.kmutt.thaitone.R;

import java.util.ArrayList;

/**
 * Created by 006075 on 3/10/2559.
 */

public class LearnByActionsCollection {

    public static ArrayList<Object> getLernByActions () {
        ArrayList<Object> learn_by_actions = new ArrayList<>();
        LearnByActions learn_by_action = null;

        //Set 1
        learn_by_actions.add("เสียงสามัญ");
        learn_by_action = new LearnByActions();
        learn_by_action.setName_thai("กิน");
        learn_by_action.setName_eng("eat");
        learn_by_action.setImg(R.drawable.thaitone05);
        learn_by_actions.add(learn_by_action);

        return learn_by_actions;
    }
}
