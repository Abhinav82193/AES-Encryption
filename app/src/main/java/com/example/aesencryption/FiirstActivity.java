package com.example.aesencryption;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.UriPermission;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class FiirstActivity extends AppCompatActivity {
   TextView textview1,textview2;
   ImageView imageview1,imageview2;
   RelativeLayout relativeLayout;
   RelativeLayout relativeLayout2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fiirst);
        textview1=findViewById(R.id.txt1);
        textview2=findViewById(R.id.txt2);
        imageview1=findViewById(R.id.imageview);
        imageview2=findViewById(R.id.imageview2);
        relativeLayout=findViewById(R.id.ll1);
        relativeLayout2=findViewById(R.id.ll2);

    }

    public void AES(View view) {
        Intent intent=new Intent(FiirstActivity.this,MainActivity.class);
        startActivity(intent);
    }

    public void MD5(View view) {
        Intent intent2=new Intent(FiirstActivity.this,MainActivity2.class);
        startActivity(intent2);
    }


}