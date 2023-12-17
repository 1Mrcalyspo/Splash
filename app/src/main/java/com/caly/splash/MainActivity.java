package com.caly.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   ImageView im;
   TextView text;
   Animation top,mid,bot;
    private static int SPLASH_TIME_OUT = 2000;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        im=findViewById(R.id.imag);
        text=findViewById(R.id.text);
        top = AnimationUtils.loadAnimation(this, R.anim.top);
        bot = AnimationUtils.loadAnimation(this, R.anim.bot);
        mid= AnimationUtils.loadAnimation(this, R.anim.mid);
        im.setAnimation(top);
        text.setAnimation(bot);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, secondActivity.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }


    }
