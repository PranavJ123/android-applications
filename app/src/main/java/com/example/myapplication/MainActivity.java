package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


   Button b1,b2,b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"onCreate invoked",Toast.LENGTH_LONG).show();
        b1 = findViewById(R.id.btn1);
        b2 = findViewById(R.id.btn2);
        b3 = findViewById(R.id.btn3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                b1.setText("button 1 submitted");
            }
        });

        b2.setOnClickListener(e->{
            b2.setText("Button 2 submitted");
        });
        b3.setOnClickListener(new MyListener());

    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"onStart invoked",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"onStop invoked",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"onDestroy invoked",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(this,"onResume invoked",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(this, "onPause invoked", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Toast.makeText(this, "onRestart invoked", Toast.LENGTH_SHORT).show();
    }

//    public void performClick(View v) {
//        switch (v.getId()){
//            case R.id.btn1:
//                Toast.makeText(this,"Button 1 clicked",Toast.LENGTH_LONG).show();
//            case R.id.btn2:
//                Toast.makeText(this,"Button 2 clicked",Toast.LENGTH_LONG).show();
//            case R.id.btn3:
//                Toast.makeText(this,"Button 3 clicked",Toast.LENGTH_LONG).show();
//        }
//
//    }


}