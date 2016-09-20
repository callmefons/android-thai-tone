package com.thai.kmutt.thaitone.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.thai.kmutt.thaitone.MainMenuActivity;
import com.thai.kmutt.thaitone.R;

public class ThreeFragment extends Fragment {

    TextView textView1;
    Button btn_enter;

    public static ThreeFragment newInstance() {
        ThreeFragment fragment = new ThreeFragment();
        return fragment;
    }

    public ThreeFragment() { }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_three, container, false);
        textView1 = (TextView)rootView.findViewById(R.id.textView1);
        btn_enter = (Button)rootView.findViewById(R.id.btn_enter);
        btn_enter.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),MainMenuActivity.class);
                startActivity(intent);
            }
        });

        return rootView;
    }
    public String getMyText() {
        return textView1.getText().toString();
    }

}
