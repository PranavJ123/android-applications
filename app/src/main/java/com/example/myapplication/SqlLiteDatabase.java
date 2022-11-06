package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class SqlLiteDatabase extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sql_lite_database);
        DatabaseHandler mydb = new DatabaseHandler(this);
        CCSIT obj = new CCSIT(1,"Pranav");
        long count = mydb.insertData(obj);
        if(count>0){
            Toast.makeText(this, "data inserted"+count, Toast.LENGTH_LONG).show();
        }

    }
}