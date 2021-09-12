package com.example.aesencryption;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Algorithms extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algorithms);
    }

    public void openAes(View view) {
        Intent intent=new Intent(Algorithms.this,MainActivity.class);
        startActivity(intent);
    }

    public void openMd5(View view) {
        Intent intent=new Intent(Algorithms.this,MD5.class);
        startActivity(intent);
    }
}