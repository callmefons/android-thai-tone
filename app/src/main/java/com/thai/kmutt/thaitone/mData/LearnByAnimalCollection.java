package com.thai.kmutt.thaitone.mData;

import java.util.ArrayList;
import com.thai.kmutt.thaitone.R;

/**
 * Created by 006075 on 3/10/2559.
 */

public class LearnByAnimalCollection {

    public static ArrayList<Object> getLernByAnimal() {
        ArrayList<Object> learn_by_animals = new ArrayList<>();
        LearnByAnimal learn_by_animal = null;

        //Set 1
        learn_by_animals.add("เสียงสามัญ");
        learn_by_animal = new LearnByAnimal();
        learn_by_animal.setName_thai("กา");
        learn_by_animal.setName_eng("crow");
        learn_by_animal.setImg(R.drawable.thaitone05);
        learn_by_animals.add(learn_by_animal);
        //Set 1
        learn_by_animals.add("เสียงเอก");
        learn_by_animal = new LearnByAnimal();
        learn_by_animal.setName_thai("สิบ");
        learn_by_animal.setName_eng("ten");
        learn_by_animal.setImg(R.drawable.thaitone05);
        learn_by_animals.add(learn_by_animal);


        return learn_by_animals;
    }
}
