package com.example.akura.funwithsensors;

import android.content.Context;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity
{
    SeekBar bar;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button vibrator = findViewById(R.id.button);
        bar = findViewById(R.id.seekBar);

        vibrator.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Vibrator v = (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);

                long value = bar.getProgress() * 1000;

                v.vibrate(value);
            }
        });
    }
}
