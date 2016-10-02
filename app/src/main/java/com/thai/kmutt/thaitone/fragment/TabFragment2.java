package com.thai.kmutt.thaitone.fragment;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.thai.kmutt.thaitone.ConsonantsActivity;
import com.thai.kmutt.thaitone.LearnEachThaiActivity;
import com.thai.kmutt.thaitone.LearnToneByCategory;
import com.thai.kmutt.thaitone.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TabFragment2 extends Fragment {

    Button btn_learning_each_thai_tones,
            btn_learn_by_cat;
    public TabFragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tab_fragment2, container, false);
        btn_learning_each_thai_tones = (Button) rootView.findViewById(R.id.btn_learning_each_thai_tones);
        btn_learn_by_cat = (Button)rootView.findViewById(R.id.btn_learn_by_cat);

        Context context = getContext();

//        MediaPlayer mp = MediaPlayer.create(getContext(),R.raw.animals013);
        btn_learning_each_thai_tones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), LearnEachThaiActivity.class);
                startActivity(intent);
            }
        });

        btn_learn_by_cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), LearnToneByCategory.class);
                startActivity(intent);
            }
        });

        // Inflate the layout for this fragment
        return rootView;
    }

}
