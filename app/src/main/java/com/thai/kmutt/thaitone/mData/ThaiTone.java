package com.thai.kmutt.thaitone.mData;

import android.media.Image;

/**
 * Created by 006075 on 24/9/2559.
 */

public class ThaiTone {

    String name;
    String tone;
    String meaning;
    int img;
    int sound;

    public int getSound() {
        return sound;
    }

    public void setSound(int sound) {
        this.sound = sound;
    }

    public ThaiTone() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTone() {
        return tone;
    }

    public void setTone(String tone) {
        this.tone = tone;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }


}
