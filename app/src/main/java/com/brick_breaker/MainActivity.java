package com.brick_breaker;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txt1,txt2;
    ImageButton startbtn;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        txt1=findViewById(R.id.txt1);
        txt2=findViewById(R.id.txt2);
        startbtn=findViewById(R.id.startbtn);

        Animation myanimation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.animation2);
        txt1.startAnimation(myanimation);
        Animation myanimatione = AnimationUtils.loadAnimation(MainActivity.this,R.anim.animation1);
        txt2.startAnimation(myanimatione);
    }
    public void startGame(View view){
        Animation btn = AnimationUtils.loadAnimation(MainActivity.this,R.anim.animation6);
        startbtn.startAnimation(btn);
        GameView gameView = new GameView(this);
        setContentView(gameView);

    }


}