package com.thai.kmutt.thaitone.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.thai.kmutt.thaitone.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class OneFragment extends Fragment {

    TextView textView1;

    public static OneFragment newInstance() {
        OneFragment fragment = new OneFragment();
        return fragment;
    }

    public OneFragment() { }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_one, container, false);
        textView1 = (TextView)rootView.findViewById(R.id.textView1);
        return rootView;
    }

    public String getMyText() {
        return textView1.getText().toString();
    }

}
