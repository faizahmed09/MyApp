package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CityActivity extends AppCompatActivity {

    Button kan;
    Button pry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);

        kan = findViewById(R.id.button5);
        pry = findViewById(R.id.button4);

        pry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CityActivity.this, PraygActivity.class));
            }
        });


        kan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CityActivity.this, KanpurActivity.class));
            }
        });
    }
}