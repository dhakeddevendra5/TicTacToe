package com.devendra.tictactoe;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;


public class SplashActivity extends AppCompatActivity {

    TextView title;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        title=findViewById(R.id.tit);

        Intent intent=new Intent(SplashActivity.this,MainActivity.class);
        Animation sc =AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale);
        Animation al =AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
        //delaying for 4 seconds
        title.startAnimation(al);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                title.startAnimation(sc);
            }
        },3000);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(intent);
                finish();
            }
        },10000);
    }
}