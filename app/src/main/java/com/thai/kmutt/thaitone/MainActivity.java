package com.thai.kmutt.thaitone;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.thai.kmutt.thaitone.fragment.ThreeFragment;

public class MainActivity extends AppCompatActivity {
    MyPageAdapter adapter;
    ViewPager pager;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new MyPageAdapter(getSupportFragmentManager());

        pager = (ViewPager) findViewById(R.id.pager);
        pager.setAdapter(adapter);

        Button btn_next = (Button)findViewById(R.id.btn_next);
        btn_next.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                pager.setCurrentItem(pager.getCurrentItem() + 1);
            }
        });

        Button btn_prev = (Button)findViewById(R.id.btn_prev);
        btn_prev.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                pager.setCurrentItem(pager.getCurrentItem() - 1);
            }
        });

        Button btn_request = (Button)findViewById(R.id.btn_request);
        btn_request.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Fragment fragment = getActiveFragment(pager, 2);
                ThreeFragment threeFragment = (ThreeFragment)fragment;
                if(threeFragment != null) {
//                    pager.setCurrentItem(2);
                    String message = threeFragment.getMyText();
                    Log.i("Check", message);
                }
            }
        });
    }
    public Fragment getActiveFragment(ViewPager container, int position) {
        String name = "android:switcher:" + container.getId() + ":" + position;
        return getSupportFragmentManager().findFragmentByTag(name);
    }

}