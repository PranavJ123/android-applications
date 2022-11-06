package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.widget.Button;
import android.widget.Chronometer;

public class ChronometerApp extends AppCompatActivity {
    Chronometer ch;
    Button btn1,btn2,btn3,btn4,btn5;
    boolean isRunning = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chronometer_app);
        ch = findViewById(R.id.chronometer);
        btn1 = findViewById(R.id.start);
        btn2 = findViewById(R.id.stop);
        btn3 = findViewById(R.id.restart);
        btn4 = findViewById(R.id.setformat);
        btn5 = findViewById(R.id.clearformat);

        btn1.setOnClickListener(e->{
           ch.start();
        });
        btn2.setOnClickListener(e->{
            ch.stop();
        });
        btn3.setOnClickListener(e->{
            ch.setBase(SystemClock.elapsedRealtime());
        });
        btn4.setOnClickListener(e->{
            ch.setFormat("Time (%s)");
        });
        btn5.setOnClickListener(e->{
            ch.setFormat(null);
        });
    }
}