package com.example.myapplication;

import android.view.View;
import android.widget.Toast;

public class MyListener implements View.OnClickListener{

    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(),"Button 3 submitted", Toast.LENGTH_SHORT).show();
    }
}
