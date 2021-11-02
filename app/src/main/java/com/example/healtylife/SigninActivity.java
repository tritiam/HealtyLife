package com.example.healtylife;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SigninActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
    }
    public void lupapassword (View view) {
        Intent intent = new Intent(SigninActivity.this, ForgotpasswordActivity.class);
        startActivity(intent);
    }
    public void signin (View view){
        Intent intent = new Intent(SigninActivity.this,Homescreen1Activity.class);
        startActivity(intent);
    }
}