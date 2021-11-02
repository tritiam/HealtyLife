package com.example.healtylife;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SettingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
    }
    public void personaldetail (View view) {
        Intent intent = new Intent(SettingActivity.this, ProfileActivity.class);
        startActivity(intent);
    }
    public void myitems (View view){
        Intent intent = new Intent(SettingActivity.this,StgmyitemsActivity.class);
        startActivity(intent);
    }
    public void notification (View view) {
        Intent intent = new Intent(SettingActivity.this, Stgnotification1Activity.class);
        startActivity(intent);
    }
    public void units (View view){
        Intent intent = new Intent(SettingActivity.this,StgunitActivity.class);
        startActivity(intent);
    }
    public void home (View view) {
        Intent intent = new Intent(SettingActivity.this, Homescreen1Activity.class);
        startActivity(intent);
    }
    public void foodoption (View view){
        Intent intent = new Intent(SettingActivity.this,FoodoptionsActivity.class);
        startActivity(intent);
    }
}