package com.example.healtylife;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void signin (View view){
        Intent intent = new Intent(LoginActivity.this,SigninActivity.class);
        startActivity(intent);
    }
    public void signup (View view){
        Intent intent = new Intent(LoginActivity.this,SignupActivity.class);
        startActivity(intent);
    }
}