package com.example.healtylife;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class StgunitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stgunit);
    }
    public void back(View view) {
        Intent intent =new Intent(StgunitActivity.this,SettingActivity.class);
        startActivity(intent);
    }
    public void home(View view) {
        Intent intent =new Intent(StgunitActivity.this,Homescreen1Activity.class);
        startActivity(intent);
    }
    public void settings(View view) {
        Intent intent =new Intent(StgunitActivity.this,SettingActivity.class);
        startActivity(intent);
    }
    public void foodoptions(View view) {
        Intent intent =new Intent(StgunitActivity.this,FoodoptionsActivity.class);
        startActivity(intent);
    }
}