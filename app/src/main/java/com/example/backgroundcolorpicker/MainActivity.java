package com.example.backgroundcolorpicker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button b1=(Button) findViewById(R.id.buttonRed);
        final Button b2=(Button) findViewById(R.id.buttonBlue);
        final Button b3=(Button) findViewById(R.id.buttonGREEN);
        final Button b4=(Button) findViewById(R.id.buttonYellow);
        final Button b5=(Button) findViewById(R.id.buttonOrange);
        final Button b6=(Button) findViewById(R.id.buttonBlack);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setMyScreenColor(Color.RED);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setMyScreenColor(Color.BLUE);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setMyScreenColor(Color.GREEN);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setMyScreenColor(Color.YELLOW);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setMyScreenColor(0xFFFFA500);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setMyScreenColor(Color.BLACK);
            }
        });
    }

    public void setMyScreenColor(int color)
    {
        View view =this.getWindow().getDecorView();
        view.setBackgroundColor(color);
    }
}