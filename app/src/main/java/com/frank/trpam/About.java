package com.frank.trpam;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;


public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        this.getSupportActionBar().hide();
    }
}