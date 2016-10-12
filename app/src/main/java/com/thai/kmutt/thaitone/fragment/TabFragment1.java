package com.thai.kmutt.thaitone.fragment;


import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

import com.thai.kmutt.thaitone.ConsonantsActivity;
import com.thai.kmutt.thaitone.R;
import com.thai.kmutt.thaitone.SymbolsActivity;
import com.thai.kmutt.thaitone.VowelsActivity;


/**
 * A simple {@link Fragment} subclass.
 */
public class TabFragment1 extends Fragment {

    RelativeLayout btn_consonants, btn_vowels, btn_symbols;

    public TabFragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tab_fragment1, container, false);
        btn_consonants = (RelativeLayout) rootView.findViewById(R.id.btn_consonants);
        btn_vowels = (RelativeLayout) rootView.findViewById(R.id.btn_vowels);
        btn_symbols = (RelativeLayout) rootView.findViewById(R.id.btn_symbols);
        Context context = getContext();

        btn_consonants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),ConsonantsActivity.class);
                startActivity(intent);
            }
        });
        btn_vowels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),VowelsActivity.class);
                startActivity(intent);
            }
        });

        btn_symbols.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),SymbolsActivity.class);
                startActivity(intent);
            }
        });

        // Inflate the layout for this fragment
        return rootView;
    }

}
