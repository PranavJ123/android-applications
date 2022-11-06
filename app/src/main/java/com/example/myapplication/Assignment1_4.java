package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Assignment1_4 extends AppCompatActivity {

    ImageView img;
    TextView text;
    Button btn;
    int isSad = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment14);

        img = findViewById(R.id.image);
        btn = findViewById(R.id.button);
        text = findViewById(R.id.text);

        btn.setOnClickListener(view -> {
            if(isSad == 1) {
                isSad = 0;
                text.setText("I am so full");
                btn.setText("DONE");
                img.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.laughing));
            } else {
                isSad = 1;
                text.setText("I am so hungry");
                btn.setText("EAT COOKIE");
                img.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.sad));
            }
        });

    }
}