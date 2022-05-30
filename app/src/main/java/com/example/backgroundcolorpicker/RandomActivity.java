package com.example.backgroundcolorpicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RandomActivity extends AppCompatActivity {

    int result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);

        int min=1;
        int max=50;
        result=getRandomNumber(max,min);
    }
    static int getRandomNumber(int maxNum,int minNum)
    {
        return (int)((Math.random()*(maxNum-minNum))+minNum);
    }
    public void guessfunction(View view)
    {
        int guessNumber;
        EditText ednumber;

        ednumber=findViewById(R.id.ednumber);

        guessNumber=Integer.parseInt(ednumber.getText().toString());

        if(guessNumber<result)
        {
            Toast.makeText(this,"Guess Higher Number ",Toast.LENGTH_SHORT).show();
        }
        else if(guessNumber>result)
        {
            Toast.makeText(this,"Guess Lower Number ",Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this," YOU WON  ",Toast.LENGTH_SHORT).show();
        }
    }

}