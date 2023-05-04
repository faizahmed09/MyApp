package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class pluselevenKActivity extends AppCompatActivity {

    TextView textView10,textView_j1,textView2,textView88,textView4,textView5,textView6,textView7,textView8,textView9,textView11,textView12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pluseleven_kactivity);

        textView10 = (TextView) findViewById(R.id.textView10);
        textView_j1 = (TextView) findViewById(R.id.textView_j1);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView4 = (TextView) findViewById(R.id.textView4);
        textView5 = (TextView) findViewById(R.id.textView5);
        textView6 = (TextView) findViewById(R.id.textView6);
        textView7 = (TextView) findViewById(R.id.textView7);
        textView8 = (TextView) findViewById(R.id.textView8);
        textView9 = (TextView) findViewById(R.id.textView9);
        textView11 = (TextView) findViewById(R.id.textView11);
        textView12 = (TextView) findViewById(R.id.textView12);
        textView88 = (TextView) findViewById(R.id.textView88);
        textView10.setOnClickListener(v -> {
            // Intents are objects of the android.content.Intent type. Your code can send them to the Android system defining
            // the components you are targeting. Intent to start an activity called SecondActivity with the following code:
            Intent intent = new Intent(pluselevenKActivity.this, KVenueActivity.class);
            // start the activity connect to the specified class
            startActivity(intent);
        });
        textView_j1.setOnClickListener(v -> {
            // Intents are objects of the android.content.Intent type. Your code can send them to the Android system defining
            // the components you are targeting. Intent to start an activity called SecondActivity with the following code:
            Intent intent = new Intent(pluselevenKActivity.this, KPhotoActivity.class);
            // start the activity connect to the specified class
            startActivity(intent);
        });
        textView2.setOnClickListener(v -> {
            // Intents are objects of the android.content.Intent type. Your code can send them to the Android system defining
            // the components you are targeting. Intent to start an activity called SecondActivity with the following code:
            Intent intent = new Intent(pluselevenKActivity.this, KMakeupActivity.class);
            // start the activity connect to the specified class
            startActivity(intent);
        });

        textView4.setOnClickListener(v -> {
            // Intents are objects of the android.content.Intent type. Your code can send them to the Android system defining
            // the components you are targeting. Intent to start an activity called SecondActivity with the following code:
            Intent intent = new Intent(pluselevenKActivity.this, KGroomActivity.class);
            // start the activity connect to the specified class
            startActivity(intent);
        });
        textView5.setOnClickListener(v -> {
            // Intents are objects of the android.content.Intent type. Your code can send them to the Android system defining
            // the components you are targeting. Intent to start an activity called SecondActivity with the following code:
            Intent intent = new Intent(pluselevenKActivity.this, KDecoratorsActivity.class);
            // start the activity connect to the specified class
            startActivity(intent);
        });
        textView6.setOnClickListener(v -> {
            // Intents are objects of the android.content.Intent type. Your code can send them to the Android system defining
            // the components you are targeting. Intent to start an activity called SecondActivity with the following code:
            Intent intent = new Intent(pluselevenKActivity.this, KGiftsActivity.class);
            // start the activity connect to the specified class
            startActivity(intent);
        });
        textView7.setOnClickListener(v -> {
            // Intents are objects of the android.content.Intent type. Your code can send them to the Android system defining
            // the components you are targeting. Intent to start an activity called SecondActivity with the following code:
            Intent intent = new Intent(pluselevenKActivity.this,KCateringActivity.class);
            // start the activity connect to the specified class
            startActivity(intent);
        });
        textView8.setOnClickListener(v -> {
            // Intents are objects of the android.content.Intent type. Your code can send them to the Android system defining
            // the components you are targeting. Intent to start an activity called SecondActivity with the following code:
            Intent intent = new Intent(pluselevenKActivity.this, KMehndiActivity.class);
            // start the activity connect to the specified class
            startActivity(intent);
        });
        textView9.setOnClickListener(v -> {
            // Intents are objects of the android.content.Intent type. Your code can send them to the Android system defining
            // the components you are targeting. Intent to start an activity called SecondActivity with the following code:
            Intent intent = new Intent(pluselevenKActivity.this, KJwelleryActivity.class);
            // start the activity connect to the specified class
            startActivity(intent);
        });
        textView11.setOnClickListener(v -> {
            // Intents are objects of the android.content.Intent type. Your code can send them to the Android system defining
            // the components you are targeting. Intent to start an activity called SecondActivity with the following code:
            Intent intent = new Intent(pluselevenKActivity.this,KMusicActivity.class);
            // start the activity connect to the specified class
            startActivity(intent);
        });
        textView12.setOnClickListener(v -> {
            // Intents are objects of the android.content.Intent type. Your code can send them to the Android system defining
            // the components you are targeting. Intent to start an activity called SecondActivity with the following code:
            Intent intent = new Intent(pluselevenKActivity.this, KPdActivity.class);
            // start the activity connect to the specified class
            startActivity(intent);
        });
        textView88.setOnClickListener(v -> {
            // Intents are objects of the android.content.Intent type. Your code can send them to the Android system defining
            // the components you are targeting. Intent to start an activity called SecondActivity with the following code:
            Intent intent = new Intent(pluselevenKActivity.this, KBrideActivity.class);
            // start the activity connect to the specified class
            startActivity(intent);
        });






    }
}