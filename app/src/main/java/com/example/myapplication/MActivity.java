package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.MaskFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MActivity extends AppCompatActivity {

    Button b1,b2,b3;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mactivity);

        b1 = findViewById(R.id.o);
        b2 = findViewById(R.id.k);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MActivity.this, BookingFormActivity.class));
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MActivity.this, BookingFormActivity.class));
            }
        });
    }
}