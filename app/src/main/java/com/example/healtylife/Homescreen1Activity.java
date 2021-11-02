package com.example.healtylife;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Homescreen1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen1);
    }
    public void progress (View view){
        Intent intent = new Intent(Homescreen1Activity.this,Progress1Activity.class);
        startActivity(intent);
    }
    public void home2 (View view){
        Intent intent = new Intent(Homescreen1Activity.this,Homescreen2Activity.class);
        startActivity(intent);
    }
}