package com.example.aesencryption;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.UriPermission;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FiirstActivity extends AppCompatActivity {
    Button button1,button2,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fiirst);
        button1=findViewById(R.id.b1);
        button2=findViewById(R.id.b2);
        button3=findViewById(R.id.button);
    }

    public void AES(View view) {
        Intent intent=new Intent(FiirstActivity.this,MainActivity.class);
        startActivity(intent);
    }

    public void MD5(View view) {
        Intent intent2=new Intent(FiirstActivity.this,MainActivity2.class);
        startActivity(intent2);
    }

    public void share(View view) {
        Intent intent3=new Intent(Intent.ACTION_CALL);
        intent3.setData(Uri.parse("tel:7408690167"));
        startActivity(intent3);
    }
}