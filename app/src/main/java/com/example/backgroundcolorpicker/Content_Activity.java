package com.example.backgroundcolorpicker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Content_Activity extends AppCompatActivity {
      public  Button ThemeChanger;
      public  Button VibrationChange;
      public  Button RandomAC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        ThemeChanger=(Button) findViewById(R.id.button2);
        VibrationChange=(Button) findViewById(R.id.button3);
        RandomAC=(Button)findViewById(R.id.button6);


        RandomAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Content_Activity.this,RandomActivity.class);
                startActivity(intent);
            }
        });

        ThemeChanger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Content_Activity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        VibrationChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Content_Activity.this,Vibration.class);
                startActivity(intent);
            }
        });





    }
}