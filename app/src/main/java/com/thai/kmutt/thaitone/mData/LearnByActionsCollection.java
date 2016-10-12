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
        learn_by_actions.add("เสียงสามัญ (Mid)");
        learn_by_action = new LearnByActions();
        learn_by_action.setName_thai("กิน");
        learn_by_action.setName_eng("eat");
        learn_by_action.setImg(R.drawable.action01);
        learn_by_action.setSound(R.raw.action01);
        learn_by_actions.add(learn_by_action);

        learn_by_action = new LearnByActions();
        learn_by_action = new LearnByActions();
        learn_by_action.setName_thai("เดิน");
        learn_by_action.setName_eng("walk");
        learn_by_action.setImg(R.drawable.action02);
        learn_by_action.setSound(R.raw.action02);
        learn_by_actions.add(learn_by_action);

        learn_by_action = new LearnByActions();
        learn_by_action.setName_thai("ตี");
        learn_by_action.setName_eng("hill");
        learn_by_action.setImg(R.drawable.action03);
        learn_by_action.setSound(R.raw.action03);
        learn_by_actions.add(learn_by_action);

        learn_by_action = new LearnByActions();
        learn_by_action.setName_thai("นอน");
        learn_by_action.setName_eng("sleep");
        learn_by_action.setImg(R.drawable.action04);
        learn_by_action.setSound(R.raw.action04);
        learn_by_actions.add(learn_by_action);

        learn_by_action = new LearnByActions();
        learn_by_action.setName_thai("ปีน");
        learn_by_action.setName_eng("climb");
        learn_by_action.setImg(R.drawable.action05);
        learn_by_action.setSound(R.raw.action05);
        learn_by_actions.add(learn_by_action);

        learn_by_action = new LearnByActions();
        learn_by_action.setName_thai("มอง");
        learn_by_action.setName_eng("look");
        learn_by_action.setImg(R.drawable.action06);
        learn_by_action.setSound(R.raw.action06);
        learn_by_actions.add(learn_by_action);

        learn_by_action = new LearnByActions();
        learn_by_action.setName_thai("ยืน");
        learn_by_action.setName_eng("stand");
        learn_by_action.setImg(R.drawable.action07);
        learn_by_action.setSound(R.raw.action07);
        learn_by_actions.add(learn_by_action);

        //Set 2
        learn_by_actions.add("เสียงเอก (Low)");
        learn_by_action = new LearnByActions();
        learn_by_action.setName_thai("ถ่าย");
        learn_by_action.setName_eng("tranfer");
        learn_by_action.setImg(R.drawable.thaitone08);
        learn_by_action.setSound(R.raw.action08);
        learn_by_actions.add(learn_by_action);

        learn_by_action = new LearnByActions();
        learn_by_action.setName_thai("ปิด");
        learn_by_action.setName_eng("close");
        learn_by_action.setImg(R.drawable.thaitone09);
        learn_by_action.setSound(R.raw.action09);
        learn_by_actions.add(learn_by_action);

        learn_by_action = new LearnByActions();
        learn_by_action.setName_thai("เป่า");
        learn_by_action.setName_eng("blow");
        learn_by_action.setImg(R.drawable.thaitone10);
        learn_by_action.setSound(R.raw.action10);
        learn_by_actions.add(learn_by_action);

        learn_by_action = new LearnByActions();
        learn_by_action.setName_thai("เปิด");
        learn_by_action.setName_eng("open");
        learn_by_action.setImg(R.drawable.thaitone11);
        learn_by_action.setSound(R.raw.action11);
        learn_by_actions.add(learn_by_action);

        learn_by_action = new LearnByActions();
        learn_by_action.setName_thai("อ่าน");
        learn_by_action.setName_eng("read");
        learn_by_action.setImg(R.drawable.thaitone12);
        learn_by_action.setSound(R.raw.action12);
        learn_by_actions.add(learn_by_action);

        //Set 3
        learn_by_actions.add("เสียงโท (Falling)");
        learn_by_action = new LearnByActions();
        learn_by_action.setName_thai("เต้น");
        learn_by_action.setName_eng("dance");
        learn_by_action.setImg(R.drawable.thaitone13);
        learn_by_action.setSound(R.raw.action13);
        learn_by_actions.add(learn_by_action);

        learn_by_action = new LearnByActions();
        learn_by_action.setName_thai("เที่ยว");
        learn_by_action.setName_eng("travel");
        learn_by_action.setImg(R.drawable.thaitone14);
        learn_by_action.setSound(R.raw.action14);
        learn_by_actions.add(learn_by_action);

        learn_by_action = new LearnByActions();
        learn_by_action.setName_thai("นวด");
        learn_by_action.setName_eng("massage");
        learn_by_action.setImg(R.drawable.thaitone15);
        learn_by_action.setSound(R.raw.action15);
        learn_by_actions.add(learn_by_action);

        learn_by_action = new LearnByActions();
        learn_by_action.setName_thai("นั่ง");
        learn_by_action.setName_eng("sit");
        learn_by_action.setImg(R.drawable.thaitone16);
        learn_by_action.setSound(R.raw.action16);
        learn_by_actions.add(learn_by_action);

        learn_by_action = new LearnByActions();
        learn_by_action.setName_thai("ย่าง");
        learn_by_action.setName_eng("grill");
        learn_by_action.setImg(R.drawable.thaitone17);
        learn_by_action.setSound(R.raw.action17);
        learn_by_actions.add(learn_by_action);

        learn_by_action = new LearnByActions();
        learn_by_action.setName_thai("รีด");
        learn_by_action.setName_eng("iron");
        learn_by_action.setImg(R.drawable.thaitone18);
        learn_by_action.setSound(R.raw.action18);
        learn_by_actions.add(learn_by_action);

        learn_by_action = new LearnByActions();
        learn_by_action.setName_thai("เล่น");
        learn_by_action.setName_eng("play");
        learn_by_action.setImg(R.drawable.thaitone19);
        learn_by_action.setSound(R.raw.action19);
        learn_by_actions.add(learn_by_action);

        learn_by_action = new LearnByActions();
        learn_by_action.setName_thai("วิ่ง");
        learn_by_action.setName_eng("run");
        learn_by_action.setImg(R.drawable.thaitone20);
        learn_by_action.setSound(R.raw.action20);
        learn_by_actions.add(learn_by_action);

        learn_by_action = new LearnByActions();
        learn_by_action.setName_thai("ไหว้");
        learn_by_action.setName_eng("pray respect");
        learn_by_action.setImg(R.drawable.action21);
        learn_by_action.setSound(R.raw.action21);
        learn_by_actions.add(learn_by_action);

        //Set 4
        learn_by_actions.add("เสียงโท (Falling)");
        learn_by_action = new LearnByActions();
        learn_by_action.setName_thai("คิด");
        learn_by_action.setName_eng("think");
        learn_by_action.setImg(R.drawable.action22);
        learn_by_action.setSound(R.raw.action22);
        learn_by_actions.add(learn_by_action);

        learn_by_action = new LearnByActions();
        learn_by_action.setName_thai("เคี้ยว");
        learn_by_action.setName_eng("chew");
        learn_by_action.setImg(R.drawable.action23);
        learn_by_action.setSound(R.raw.action23);
        learn_by_actions.add(learn_by_action);

        learn_by_action = new LearnByActions();
        learn_by_action.setName_thai("ชี้");
        learn_by_action.setName_eng("point");
        learn_by_action.setImg(R.drawable.action24);
        learn_by_action.setSound(R.raw.action24);
        learn_by_actions.add(learn_by_action);

        learn_by_action = new LearnByActions();
        learn_by_action.setName_thai("ซื้อ");
        learn_by_action.setName_eng("buy");
        learn_by_action.setImg(R.drawable.action25);
        learn_by_action.setSound(R.raw.action25);
        learn_by_actions.add(learn_by_action);

        learn_by_action = new LearnByActions();
        learn_by_action.setName_thai("ยิ้ม");
        learn_by_action.setName_eng("smile");
        learn_by_action.setImg(R.drawable.action26);
        learn_by_action.setSound(R.raw.action26);
        learn_by_actions.add(learn_by_action);

        learn_by_action = new LearnByActions();
        learn_by_action.setName_thai("รด");
        learn_by_action.setName_eng("water");
        learn_by_action.setImg(R.drawable.action27);
        learn_by_action.setSound(R.raw.action27);
        learn_by_actions.add(learn_by_action);

        learn_by_action = new LearnByActions();
        learn_by_action.setName_thai("ร้อง");
        learn_by_action.setName_eng("sign");
        learn_by_action.setImg(R.drawable.action28);
        learn_by_action.setSound(R.raw.action28);
        learn_by_actions.add(learn_by_action);

        //Set 5
        learn_by_actions.add("เสียงจัดวา (Rising)");
        learn_by_action = new LearnByActions();
        learn_by_action.setName_thai("ขาย");
        learn_by_action.setName_eng("sell");
        learn_by_action.setImg(R.drawable.action29);
        learn_by_action.setSound(R.raw.action29);
        learn_by_actions.add(learn_by_action);

        learn_by_action = new LearnByActions();
        learn_by_action.setName_thai("เขียน");
        learn_by_action.setName_eng("write");
        learn_by_action.setImg(R.drawable.action30);
        learn_by_action.setSound(R.raw.action30);
        learn_by_actions.add(learn_by_action);

        learn_by_action = new LearnByActions();
        learn_by_action.setName_thai("แขวน");
        learn_by_action.setName_eng("hang");
        learn_by_action.setImg(R.drawable.action31);
        learn_by_action.setSound(R.raw.action31);
        learn_by_actions.add(learn_by_action);

        learn_by_action = new LearnByActions();
        learn_by_action.setName_thai("สอน");
        learn_by_action.setName_eng("teach");
        learn_by_action.setImg(R.drawable.action32);
        learn_by_action.setSound(R.raw.action32);
        learn_by_actions.add(learn_by_action);

        learn_by_action = new LearnByActions();
        learn_by_action.setName_thai("หา");
        learn_by_action.setName_eng("find");
        learn_by_action.setImg(R.drawable.action33);
        learn_by_action.setSound(R.raw.action33);
        learn_by_actions.add(learn_by_action);

        learn_by_action = new LearnByActions();
        learn_by_action.setName_thai("หาว");
        learn_by_action.setName_eng("yawn");
        learn_by_action.setImg(R.drawable.action34);
        learn_by_action.setSound(R.raw.action34);
        learn_by_actions.add(learn_by_action);

        learn_by_action = new LearnByActions();
        learn_by_action.setName_thai("หิว");
        learn_by_action.setName_eng("hungry");
        learn_by_action.setImg(R.drawable.action35);
        learn_by_action.setSound(R.raw.action35);
        learn_by_actions.add(learn_by_action);

        return learn_by_actions;
    }
}
