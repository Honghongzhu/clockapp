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
    private TextClock sydney_clock;
    private TextClock newyork_clock;
    private TextClock tokyo_clock;
    private TextClock london_clock;
    private TextClock berlin_clock;
    private TextClock barcelona_clock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout sydneyTime = findViewById(R.id.sydneyTime);
        TextView sydney_name = sydneyTime.findViewById(R.id.city);
        sydney_name.setText(R.string.Sydney);
        sydney_clock = sydneyTime.findViewById(R.id.time);
        sydney_clock.setTimeZone("Australia/Sydney");
        ImageView sydney_image = sydneyTime.findViewById(R.id.image);
        sydney_image.setImageResource(R.drawable.sydney);

        ConstraintLayout newyorkTime = findViewById(R.id.newyorkTime);
        TextView newyork_name = newyorkTime.findViewById(R.id.city);
        newyork_name.setText(R.string.New_York);
        newyork_clock = newyorkTime.findViewById(R.id.time);
        newyork_clock.setTimeZone("America/New_York");
        ImageView newyork_image = newyorkTime.findViewById(R.id.image);
        newyork_image.setImageResource(R.drawable.new_york);

        ConstraintLayout londonTime = findViewById(R.id.londonTime);
        TextView london_name = londonTime.findViewById(R.id.city);
        london_name.setText(R.string.London);
        london_clock = londonTime.findViewById(R.id.time);
        london_clock.setTimeZone("Europe/London");
        ImageView london_image = londonTime.findViewById(R.id.image);
        london_image.setImageResource(R.drawable.london);

        ConstraintLayout barcelonaTime = findViewById(R.id.barcelonaTime);
        TextView barcelona_name = barcelonaTime.findViewById(R.id.city);
        barcelona_name.setText(R.string.Barcelona);
        barcelona_clock = barcelonaTime.findViewById(R.id.time);
        barcelona_clock.setTimeZone("Europe/Barcelona");
        final ImageView barcelona_image = barcelonaTime.findViewById(R.id.image);
        barcelona_image.setImageResource(R.drawable.barcelona);

        ConstraintLayout berlinTime = findViewById(R.id.berlinTime);
        TextView berlin_name = berlinTime.findViewById(R.id.city);
        berlin_name.setText(R.string.Berlin);
        berlin_clock = berlinTime.findViewById(R.id.time);
        berlin_clock.setTimeZone("Europe/Berlin");
        ImageView berlin_image = berlinTime.findViewById(R.id.image);
        berlin_image.setImageResource(R.drawable.berlin);

        ConstraintLayout tokyoTime = findViewById(R.id.tokyoTime);
        TextView tokyo_name = tokyoTime.findViewById(R.id.city);
        tokyo_name.setText(R.string.Tokyo);
        tokyo_clock = tokyoTime.findViewById(R.id.time);
        tokyo_clock.setTimeZone("Asia/Tokyo");
        ImageView tokyo_image = tokyoTime.findViewById(R.id.image);
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
                    berlin_clock.setFormat24Hour("hh:mm a");
                    barcelona_clock.setFormat12Hour("hh:mm a");
                }
                else
                    sydney_clock.setFormat12Hour("hh:mm a");
                    newyork_clock.setFormat12Hour("hh:mm a");
                    london_clock.setFormat12Hour("hh:mm a");
                    tokyo_clock.setFormat12Hour("hh:mm a");
                    berlin_clock.setFormat12Hour("hh:mm a");
                    barcelona_clock.setFormat12Hour("hh:mm a");
            }
        });

        twentyfourHButton = findViewById(R.id.button24H);
        twentyfourHButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!sydney_clock.is24HourModeEnabled()) {
                    sydney_clock.setFormat12Hour("HH:mm");
                    newyork_clock.setFormat12Hour("HH:mm");
                    london_clock.setFormat12Hour("HH:mm");
                    tokyo_clock.setFormat12Hour("HH:mm");
                    berlin_clock.setFormat12Hour("HH:mm");
                    barcelona_clock.setFormat12Hour("HH:mm");
                }
                else {
                    sydney_clock.setFormat24Hour("HH:mm");
                    newyork_clock.setFormat24Hour("HH:mm");
                    london_clock.setFormat24Hour("HH:mm");
                    tokyo_clock.setFormat24Hour("HH:mm");
                    berlin_clock.setFormat24Hour("HH:mm");
                    barcelona_clock.setFormat24Hour("HH:mm");
                }
            }
        });
    }
}
