package com.example.clockapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.widget.EditText;
import java.text.DateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    private EditText sydneyTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout sydney = findViewById(R.id.city1);
    }
}
