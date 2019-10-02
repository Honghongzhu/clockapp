package com.example.clockapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextClock;

import java.text.DateFormat;
import java.util.Date;
import java.util.TimeZone;

public class MainActivity extends AppCompatActivity {
    private Button twelveHButton;
    private Button twentyfourHButton;
    private TextClock clock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout sydney = findViewById(R.id.city1);
        clock = sydney.findViewById(R.id.time);
        clock.setTimeZone("Australia/Sydney");

        twelveHButton = findViewById(R.id.button12H);
        twelveHButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clock.is24HourModeEnabled())
                    clock.setFormat24Hour("hh:mm a");
                else
                    clock.setFormat12Hour("hh:mm a");
            }
        });

        twentyfourHButton = findViewById(R.id.button24H);
        twentyfourHButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!clock.is24HourModeEnabled())
                    clock.setFormat12Hour("HH:mm");
                else
                    clock.setFormat24Hour("HH:mm");
            }
        });
    }
}
