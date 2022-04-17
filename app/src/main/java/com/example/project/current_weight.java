package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class current_weight extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_weight);
    }
    public void eight(View v)
    {
        Intent d_weight=new Intent(this, desire_weight.class);
        startActivity(d_weight);
    }
}