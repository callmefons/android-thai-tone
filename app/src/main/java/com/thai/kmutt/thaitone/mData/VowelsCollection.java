package com.thai.kmutt.thaitone.mData;

import com.thai.kmutt.thaitone.R;

import java.util.ArrayList;

/**
 * Created by 006075 on 2/10/2559.
 */

public class VowelsCollection {

    public static ArrayList<Object> getVowels()
    {
        ArrayList<Object> vowels = new ArrayList<>();
        Vowels vowel =null;

        //Set 1
        vowel = new Vowels();
        vowel.setName(R.string.group_vowelds01);
        vowel.setSound(R.raw.v109);
        vowels.add(vowel);

        vowel = new Vowels();
        vowel.setName(R.string.group_vowelds02);
        vowel.setSound(R.raw.v101);
        vowels.add(vowel);

        vowel = new Vowels();
        vowel.setName(R.string.group_vowelds03);
        vowel.setSound(R.raw.v101);
        vowels.add(vowel);

        vowel = new Vowels();
        vowel.setName(R.string.group_vowelds04);
        vowel.setSound(R.raw.v102);
        vowels.add(vowel);

        vowel = new Vowels();
        vowel.setName(R.string.group_vowelds05);
        vowel.setSound(R.raw.v110);
        vowels.add(vowel);

        vowel = new Vowels();
        vowel.setName(R.string.group_vowelds06);
        vowel.setSound(R.raw.v103);
        vowels.add(vowel);

        vowel = new Vowels();
        vowel.setName(R.string.group_vowelds07);
        vowel.setSound(R.raw.v111);
        vowels.add(vowel);

        vowel = new Vowels();
        vowel.setName(R.string.group_vowelds08);
        vowel.setSound(R.raw.v104);
        vowels.add(vowel);

        vowel = new Vowels();
        vowel.setName(R.string.group_vowelds09);
        vowel.setSound(R.raw.v107);
        vowels.add(vowel);

        vowel = new Vowels();
        vowel.setName(R.string.group_vowelds10);
        vowel.setSound(R.raw.v112);
        vowels.add(vowel);

        vowel = new Vowels();
        vowel.setName(R.string.group_vowelds11);
        vowel.setSound(R.raw.v106);
        vowels.add(vowel);

        vowel = new Vowels();
        vowel.setName(R.string.group_vowelds12);
        vowel.setSound(R.raw.v105);
        vowels.add(vowel);

        vowel = new Vowels();
        vowel.setName(R.string.group_vowelds13);
        vowel.setSound(R.raw.v113);
        vowels.add(vowel);



        return vowels;

    }
}
