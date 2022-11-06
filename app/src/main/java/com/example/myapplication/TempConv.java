package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class TempConv extends AppCompatActivity {
    TextView text;
    EditText res;
    RadioButton rbtn1,rbtn2;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp_conv);
        text = findViewById(R.id.convertedText);
        res = findViewById(R.id.etTemp);
        rbtn1 = findViewById(R.id.rbtn1);
        rbtn2 = findViewById(R.id.rbtn2);
        btn = findViewById(R.id.btn);


        rbtn1.setOnCheckedChangeListener((compoundButton, b) -> {
            if(b){
                rbtn2.setChecked(false);
            }
        });
        rbtn2.setOnCheckedChangeListener((compoundButton, b) -> {
            if(b){
                rbtn1.setChecked(false);
            }
        });

        btn.setOnClickListener(view -> {
            String str = res.getText().toString();
            if(!str.isEmpty()){
                float convert = Float.parseFloat(str);
                text.setText(String.valueOf(tempConversion(convert)));
            }else{
                Toast.makeText(this,"Please enter any value",Toast.LENGTH_LONG).show();
            }
        });
    }

    private double tempConversion(float temp){
        if(rbtn1.isChecked()){
            return ((temp-32.0)*(5.0)/9.0);
        }
        return ((temp*(9.0/5.0))+32.0);
    }
}