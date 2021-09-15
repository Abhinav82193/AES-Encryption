package com.example.aesencryption;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class SplashActivity extends AppCompatActivity {
    TextView textView;
    MediaPlayer mysong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        textView=findViewById(R.id.t1);
        mysong=MediaPlayer.create(SplashActivity.this,R.raw.song);
        getSupportActionBar().hide();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        mysong.start();
      //  YoYo.with(Techniques.Bounce).duration(1000).repeat(1).playOn(textView);

        Thread thread=new Thread(){
            public void run(){
                try {
                    sleep(30000);

                }catch(Exception e){
                    e.printStackTrace();
                }
                finally {
                    Intent intent=new Intent(SplashActivity.this,FiirstActivity.class);
                    startActivity(intent);
                    mysong.release();
                    finish();
                }
            }

        };thread.start();
    }
}