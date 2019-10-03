package com.example.clockapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button twelveHButton;
    private Button twentyfourHButton;
    private TextView sydney_name;
    private TextClock sydney_clock;
    private ImageView sydney_image;
    private TextView newyork_name;
    private TextClock newyork_clock;
    private ImageView newyork_image;
    private TextView tokyo_name;
    private TextClock tokyo_clock;
    private ImageView tokyo_image;
    private TextView london_name;
    private TextClock london_clock;
    private ImageView london_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout sydneyTime = findViewById(R.id.sydneyTime);
        sydney_name = sydneyTime.findViewById(R.id.city);
        sydney_name.setText(R.string.Sydney);
        sydney_clock = sydneyTime.findViewById(R.id.time);
        sydney_clock.setTimeZone("Australia/Sydney");
        sydney_image = sydneyTime.findViewById(R.id.image);
        sydney_image.setImageResource(R.drawable.sydney);

        ConstraintLayout newyorkTime = findViewById(R.id.newyorkTime);
        newyork_name = newyorkTime.findViewById(R.id.city);
        newyork_name.setText(R.string.New_York);
        newyork_clock = newyorkTime.findViewById(R.id.time);
        newyork_clock.setTimeZone("America/New_York");
        newyork_image = newyorkTime.findViewById(R.id.image);
        newyork_image.setImageResource(R.drawable.new_york);

        ConstraintLayout londonTime = findViewById(R.id.londonTime);
        london_name = londonTime.findViewById(R.id.city);
        london_name.setText(R.string.London);
        london_clock = londonTime.findViewById(R.id.time);
        london_clock.setTimeZone("England/London");
        london_image = londonTime.findViewById(R.id.image);
        london_image.setImageResource(R.drawable.london);

        ConstraintLayout tokyoTime = findViewById(R.id.tokyoTime);
        tokyo_name = tokyoTime.findViewById(R.id.city);
        tokyo_name.setText(R.string.Tokyo);
        tokyo_clock = tokyoTime.findViewById(R.id.time);
        tokyo_clock.setTimeZone("Japan/Tokyo");
        tokyo_image = tokyoTime.findViewById(R.id.image);
        tokyo_image.setImageResource(R.drawable.japan);

        twelveHButton = findViewById(R.id.button12H);
        twelveHButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sydney_clock.is24HourModeEnabled()){
                    sydney_clock.setFormat24Hour("hh:mm a");
                    newyork_clock.setFormat24Hour("hh:mm a");
                    london_clock.setFormat24Hour("hh:mm a");
                    tokyo_clock.setFormat24Hour("hh:mm a");
                }
                else
                    sydney_clock.setFormat12Hour("hh:mm a");
                    newyork_clock.setFormat24Hour("hh:mm a");
                    london_clock.setFormat24Hour("hh:mm a");
                    tokyo_clock.setFormat24Hour("hh:mm a");
            }
        });

        twentyfourHButton = findViewById(R.id.button24H);
        twentyfourHButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!sydney_clock.is24HourModeEnabled())
                    sydney_clock.setFormat12Hour("HH:mm");
                else
                    sydney_clock.setFormat24Hour("HH:mm");
            }
        });
    }
}
