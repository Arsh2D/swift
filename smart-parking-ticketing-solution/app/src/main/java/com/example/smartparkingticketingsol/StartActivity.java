package com.example.smartparkingticketingsol;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

    public void userLoginPage(View view){
        Intent intent = new Intent(StartActivity.this,MainActivity.class);
        startActivity(intent);
    }

    public void ownerLoginPage(View view){
        Intent i = new Intent(this,OwnerLoginActivity.class);
        startActivity(i);
    }
}