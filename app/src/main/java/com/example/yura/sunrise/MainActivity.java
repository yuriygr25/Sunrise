package com.example.yura.sunrise;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    private Bitmap mBitmap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res = this.getResources();
        mBitmap = BitmapFactory.decodeResource(res, R.drawable.cat_bottom);


    }

    public void onClick(View view) {
        // Получим ссылку на солнце
        ImageView sunImageView = (ImageView) findViewById(R.id.sun);
        // Анимация для восхода солнца
        Animation sunRiseAnimation = AnimationUtils.loadAnimation(this, R.anim.sun_rise);
        // Подключаем анимацию к нужному View
        sunImageView.startAnimation(sunRiseAnimation);

        // Получим ссылку на часы
        ImageView clockImageView = (ImageView) findViewById(R.id.clock);
        // анимация для вращения часов
        Animation clockTurnAnimation = AnimationUtils.loadAnimation(this, R.anim.clock_turn);
        clockImageView.startAnimation(clockTurnAnimation);

        // получим ссылку на часовую стрелку
        ImageView hourImageView = (ImageView) findViewById(R.id.hour_hand);
        // анимация для стрелки
        Animation hourTurnAnimation = AnimationUtils.loadAnimation(this, R.anim.hour_turn);
        // присоединяем анимацию
        hourImageView.startAnimation(hourTurnAnimation);
    }
}