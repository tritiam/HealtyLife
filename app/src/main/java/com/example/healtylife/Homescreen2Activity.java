package com.example.healtylife;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Homescreen2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen2);
    }
    public void foodoption (View view) {
        Intent intent = new Intent(Homescreen2Activity.this, FoodoptionsActivity.class);
        startActivity(intent);
    }
    public void settings (View view){
        Intent intent = new Intent(Homescreen2Activity.this,SettingActivity.class);
        startActivity(intent);
    }
}