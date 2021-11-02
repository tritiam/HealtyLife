package com.example.healtylife;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class LogdinnerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logdinner);
    }
    public void back (View view) {
        Intent intent = new Intent(LogdinnerActivity.this, FoodoptionsActivity.class);
        startActivity(intent);
    }
    public void create (View view){
        Intent intent = new Intent(LogdinnerActivity.this,CreatefoodActivity.class);
        startActivity(intent);
    }
}