package com.thai.kmutt.thaitone.mApdater;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.thai.kmutt.thaitone.fragment.OneFragment;
import com.thai.kmutt.thaitone.fragment.ThreeFragment;
import com.thai.kmutt.thaitone.fragment.TwoFragment;

/**
 * Created by nattafahh on 9/19/2016 AD.
 */
public class MyPageAdapter extends FragmentPagerAdapter {
    private final int NUM_ITEMS = 3;

    public MyPageAdapter(FragmentManager fm) {
        super(fm);
    }

    public int getCount() {
        return NUM_ITEMS;
    }

    public Fragment getItem(int position) {
        if(position == 0)
            return OneFragment.newInstance();
        else if(position == 1)
            return TwoFragment.newInstance();
        else if(position == 2)
            return ThreeFragment.newInstance();
        return null;
    }
}
