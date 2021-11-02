package com.example.healtylife;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ForgotpasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgotpassword);
    }
    public void resetpass (View view){
        Intent intent = new Intent(ForgotpasswordActivity.this, SigninActivity.class);
        startActivity(intent);
    }
}