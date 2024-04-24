package com.brick_breaker;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class GameOver extends AppCompatActivity {
    TextView tvPoints;
    ImageButton imgBtn1,imgBtn2;
    ImageView ivNewHighest,ivLooser;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_over);
        imgBtn1=findViewById(R.id.imgBtn1);
        imgBtn2=findViewById(R.id.imgBtn2);


        ivNewHighest = findViewById(R.id.ivNewHeighest);
        ivLooser=findViewById(R.id.ivLooser);
        tvPoints = findViewById(R.id.tvPoints);
        int points = getIntent().getExtras().getInt("points");
        if(points ==240){
            ivNewHighest.setVisibility(View.VISIBLE);
            Animation anim = AnimationUtils.loadAnimation(GameOver.this,R.anim.animation6);
            ivNewHighest.startAnimation(anim);
        }
        else{
            ivLooser.setVisibility(View.VISIBLE);
            Animation anima = AnimationUtils.loadAnimation(GameOver.this,R.anim.animation6);
            ivLooser.startAnimation(anima);
        }
        tvPoints.setText(""+points);
    }
    public void restart(View view){
        Animation imageanim = AnimationUtils.loadAnimation(GameOver.this,R.anim.animation5);
        imgBtn1.startAnimation(imageanim);
        Intent intent = new Intent(GameOver.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
    public void exit(View view){
        Animation imageanime = AnimationUtils.loadAnimation(GameOver.this,R.anim.animation5);
        imgBtn2.startAnimation(imageanime);
        finish();
    }
}