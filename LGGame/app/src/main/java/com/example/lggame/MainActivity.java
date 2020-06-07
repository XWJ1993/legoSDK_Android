package com.example.lggame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.lgsdk.LGSDK;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LGSDK.logo();
    }
}