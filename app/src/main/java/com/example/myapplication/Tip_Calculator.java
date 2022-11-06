package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Tip_Calculator extends AppCompatActivity {
    EditText e1,e2;
    TextView t1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_calculator);
        e1=findViewById(R.id.ed1);
        e2=findViewById(R.id.ed2);
        t1=findViewById(R.id.tv3);
        b1 = findViewById(R.id.btn);

        b1.setOnClickListener(e->{
            int a = Integer.parseInt(e1.getText().toString());
            int b = Integer.parseInt(e2.getText().toString());
            int result = (a*b)/100;
            t1.setText("Result:"+result);
        });

    }
}