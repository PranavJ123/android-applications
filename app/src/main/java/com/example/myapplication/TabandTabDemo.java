package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class TabandTabDemo extends AppCompatActivity {
ViewPager vp;
TabLayout tbl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taband_tab_demo);
        vp = findViewById(R.id.vp);
        tbl = findViewById(R.id.tbl);
        int length = tbl.getTabCount();
        MyAdapter adapter = new MyAdapter(this,getSupportFragmentManager(),length);
        vp.setAdapter(adapter);
        tbl.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                vp.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }
}