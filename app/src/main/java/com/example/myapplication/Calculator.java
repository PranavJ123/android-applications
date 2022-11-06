package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Calculator extends AppCompatActivity {
    Button b1,b2,b3,b4;
    EditText et1,et2;
    TextView t1;
    int num1,num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        et1 = findViewById(R.id.text1);
        et2 = findViewById(R.id.text2);
        b1 = findViewById(R.id.btn1);
        b2 =findViewById(R.id.btn2);
        b3 = findViewById(R.id.btn3);
        b4 = findViewById(R.id.btn4);
        t1 = findViewById(R.id.tv);

        b1.setOnClickListener(e->{
            if(readText()) t1.setText(num1 + "+" + num2 + "=" + (num1+num2));
        });
        b2.setOnClickListener(e->{
            if(readText())
            t1.setText(num1 + "-" + num2 + "=" + (num1-num2));
        });
        b3.setOnClickListener(e->{
            if(readText())
            t1.setText(num1 + "*" + num2 + "=" + (num1*num2));
        });
        b4.setOnClickListener(e->{
            if(readText()) t1.setText(num1 + "/" + num2 + "=" + (num1/num2));
        });

    }
    public boolean readText(){
        String str1 = et1.getText().toString();
        String str2 = et2.getText().toString();
        if(!str1.isEmpty() && !str2.isEmpty()){
            num1 = Integer.parseInt(str1);
            num2 = Integer.parseInt(str2);
            return true;
        }else{
            t1.setText("Your result is: ________");
            Toast.makeText(this, "Please enter value", Toast.LENGTH_SHORT).show();
            return false;
        }
    }
}