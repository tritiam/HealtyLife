package com.example.healtylife;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Stgnotification1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stgnotification1);
    }
    public void back(View view) {
        Intent intent =new Intent(Stgnotification1Activity.this,SettingActivity.class);
        startActivity(intent);
    }
    public void home(View view) {
        Intent intent =new Intent(Stgnotification1Activity.this,Homescreen1Activity.class);
        startActivity(intent);
    }
    public void settings(View view) {
        Intent intent =new Intent(Stgnotification1Activity.this,SettingActivity.class);
        startActivity(intent);
    }
    public void foodoptions(View view) {
        Intent intent =new Intent(Stgnotification1Activity.this,FoodoptionsActivity.class);
        startActivity(intent);
    }
}