package com.example.myapplication;

import androidx.fragment.app.FragmentManager;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyAdapter extends FragmentPagerAdapter {
    Context con;
    FragmentManager fm;
    int length;
    public MyAdapter(Context con, FragmentManager fm,int length){
        super(fm);
        this.con = con;
        this.fm = fm;
        this.length = length;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new BlankFragment1();
            case 1:
                return new BlankFragment2();
            case 2:
                return new BlankFragment3();
            case 3:
                return new BlankFragment4();
            default:
                return null;


        }
    }

    @Override
    public int getCount() {
        return length;
    }
}
