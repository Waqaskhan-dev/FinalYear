package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void openactivty(View v)
    {
        Intent intent=new Intent(this, welcome.class);
        startActivity(intent);
    }
    public void login_credintionls(View v)
    {
        Intent lo=new Intent(this,login.class);
        startActivity(lo);
    }
}