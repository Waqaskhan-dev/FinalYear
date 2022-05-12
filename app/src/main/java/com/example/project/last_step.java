package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class last_step extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last_step);
    }
    public void using_email(View view)
    {
        Intent usemail=new Intent(this, createaccount.class);
        startActivity(usemail);
    }

}