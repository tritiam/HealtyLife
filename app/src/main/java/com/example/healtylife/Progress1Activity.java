package com.example.healtylife;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Progress1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress1);
    }
    public void back (View view){
        Intent intent = new Intent(Progress1Activity.this,Homescreen1Activity.class);
        startActivity(intent);
    }
}