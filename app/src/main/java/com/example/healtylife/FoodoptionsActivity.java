package com.example.healtylife;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class FoodoptionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodoptions);
    }
    public void logdinner (View view){
        Intent intent = new Intent(FoodoptionsActivity.this, LogdinnerActivity.class);
        startActivity(intent);
    }
    public void logbreakfast (View view){
        Intent intent = new Intent(FoodoptionsActivity.this,LogbreakfastActivity.class);
        startActivity(intent);
    }
    public void logsnack (View view){
        Intent intent = new Intent(FoodoptionsActivity.this,LogsnackActivity.class);
        startActivity(intent);
    }
    public void loglunch (View view){
        Intent intent = new Intent(FoodoptionsActivity.this,LoglunchActivity.class);
        startActivity(intent);
    }
    public void home (View view){
        Intent intent = new Intent(FoodoptionsActivity.this,Homescreen1Activity.class);
        startActivity(intent);
    }
    public void settings (View view){
        Intent intent = new Intent(FoodoptionsActivity.this,SettingActivity.class);
        startActivity(intent);
    }
}