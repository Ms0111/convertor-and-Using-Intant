package com.example.labwork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.WindowManager;
import android.widget.ImageView;

public class splach_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splach_screen);
        Intent intent = new Intent(splach_screen.this, MainActivity.class);


        getWindow().setFlags(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN, WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_splach_screen);


        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(splach_screen.this, MainActivity.class);
                startActivity(intent);
            }
        }, 3000);


////        SystemClock time = null;
////        time.sleep(10000);
//        ImageView imageView = findViewById(R.id.splashscreen);
//        imageView.setImageResource(R.drawable.splash_icon);
//        startActivity(intent);
//        finish();
//        SystemClock time = null;
//        time.sleep(10000);
    }
}