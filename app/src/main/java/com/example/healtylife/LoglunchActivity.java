package com.example.healtylife;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class LoglunchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loglunch);
    }
    public void back (View view) {
        Intent intent = new Intent(LoglunchActivity.this, FoodoptionsActivity.class);
        startActivity(intent);
    }
    public void create (View view){
        Intent intent = new Intent(LoglunchActivity.this,CreatefoodActivity.class);
        startActivity(intent);
    }
}