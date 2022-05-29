package com.example.backgroundcolorpicker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

         new Handler().postDelayed(new Runnable() {
             @Override
             public void run() {
                 Intent iHome =new Intent(SplashActivity.this,Content_Activity.class);
                 startActivity(iHome);
                 finish();
             }
         },4000);

    }
}